package com.virtusa.beans;




import java.io.IOException;   
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FacilitiesServlet extends HttpServlet {
   // SQL query
   private static final String SELECT_FACILITIES_QUERY = 
         "SELECT CASEFILE_TYPE, EVIDENCE, CASE_REPORT FROM FACILITIES WHERE CASEFILE_NO = ?";

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse res) 
         throws ServletException, IOException {

      // variables
      PrintWriter pw = null;
      int sno = 0;
      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      boolean flag = false;

      // set content type
      res.setContentType("text/html");
      // get Writer
      pw = res.getWriter();

      // get form data
      sno = Integer.parseInt(req.getParameter("casefile_no"));

      try {
         // register JDBC driver
         Class.forName("com.mysql.cj.jdbc.Driver");
         // create JDBC connection
         con = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/fms", "root", "mahesh");
         // compile SQL query and store it in
         // PreparedStatement object
         if (con != null)
            ps = con.prepareStatement(SELECT_FACILITIES_QUERY);
         // set input value to query parameter
         if (ps != null)
            ps.setInt(1, sno);
         // execute the query
         if (ps != null)
            rs = ps.executeQuery();

         // process the result
         if (rs != null) {
            while (rs.next()) {
               // display result
               flag = true;
               pw.println("<html><body><h1>Case Details</h1>" 
                    + "<table style='text-align:center;padding:5px' border='1'><tr style='background-color:black;color:white'><th>Type:</th> " 
                   + "<th>Evidence:</th> " 
                    + "<th>Report:</th> </tr>"
                    + "<tr style=''><td>"
                    + rs.getString("CASEFILE_TYPE") 
                    +"</td>"
                    + "<td>"
                    +rs.getString("EVIDENCE") 
                    
                   +"</td>"
                   + "<td>"
                   +rs.getString("CASE_REPORT") +"</td></tr></table></body></html>" );
            }
         }

         // Student not found
         if (!flag) {
            pw.println("<h1>Case Not Found.</h1>");
            //rs.getString("CASEFILE_TYPE") 
            //rs.getString("SAMPLE_COLL")
            //rs.getString("CASE_RES")
         }

      } catch (SQLException se) {
         se.printStackTrace();
         pw.println("Error Occured");
      } catch (Exception e) {
         e.printStackTrace();
         pw.println("Unknown Exception Occured");
      } finally {
         // close JDBC connection
         try {
            if (rs != null)
               rs.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }
         try {
            if (ps != null)
               ps.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }
         try {
            if (con != null)
               con.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }

         // Link to home
         pw.println("<h3><a href='input.jsp'>Back</a></h3>");
         // close stream
         pw.close();
      }
   }

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res) 
         throws ServletException, IOException {
      doGet(req, res);
   }
}