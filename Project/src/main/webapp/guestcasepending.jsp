<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("casefile_no");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "fms";
String userid = "root";
String password = "mahesh";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<center>
<i><h1>Pending cases of Guest</h1></i>
<table border="1">
<tr>
<td>gid</td>
<td>deptname</td>
<td>casefile_type</td>
<td>case_status</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from guest where case_status='pending'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("gid") %></td>
<td><%=resultSet.getString("deptname") %></td>
<td><%=resultSet.getString("casefile_type") %></td>
<td><%=resultSet.getString("case_status") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</center></body>
</html>