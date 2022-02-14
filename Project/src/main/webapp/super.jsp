<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: #383a3d;
  }
  button {   
       background-color:black;
       width: 30%;      
		border-radius: 10px;
        color:white;
       padding: 10px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }  
          .container {   
 		width:30%;
        padding: 80px;   
        background-color:pink;
         border-radius: 10px; 
    } 
       
</style>
</head>
<body>
<center><br><br>
<div class="container"> 
<form action="index.jsp">
<h1>view guest cases</h1>
<h3><a href =guestcasepending.jsp>pending cases</a></h3>
<h3><a href =guestcaseclosed.jsp>closed cases</a></h3>
<h1>view officer cases</h1>
<h3><a href =officercasepending.jsp>pending cases</a></h3>
<h3><a href =officercaseclosed.jsp>closed cases</a></h3>
<br>
<input type="submit" value="logout">

</form></div></center>
</body>
</html>