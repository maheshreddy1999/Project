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
  background-color:#383a3d;
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
<form action="Admin.jsp">
<h1>View Users</h1>
<h2><a href =adminview>click to view</a></h2>
<h1>Create Users</h1>
<h2><a href =Adminform>click to Create</a></h2>
<br>
<input type="submit" value="logout">

</form></div></center>
</body>
</html>