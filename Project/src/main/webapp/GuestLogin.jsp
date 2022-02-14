<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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
<h2>View Cases</h2>
<h3><a href =Guestview>click to view</a></h3>
<h2>Add new Cases</h2>
<h3><a href =Guestform>click to Add</a></h3>
<h2>View Case Details</h2>
<h3><a href=input.jsp>click to view </a></h3><br>
<input type="submit" value="logout">
</form></div></center>
</body>
</html>