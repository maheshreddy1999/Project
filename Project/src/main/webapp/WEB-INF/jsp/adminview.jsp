<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr:nth-child(even) {
  background-color: #D6EEEE;
}
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-image:url(https://th.bing.com/th/id/R.81d03a323458407399c1076f33e29658?rik=nMP%2fkOqZawRZgQ&riu=http%3a%2f%2fwww.solidbackgrounds.com%2fimages%2f2560x1440%2f2560x1440-waterspout-solid-color-background.jpg&ehk=vRanKEcQWK7slCakJcF%2b0wZCuVaprpUERWL4w74zL9U%3d&risl=&pid=ImgRaw&r=0);
  }
  <style type="text/css">
tr:nth-child(even) {
  background-color: #D6EEEE;
}
</style>
</head>
<body><center><br><br><br>
<table border="2">
<tr>
<th>UserId</th>
<th>UserType</th>  
<th>UserName</th>
<th>Password</th>
<th>edit</th>
<th>delete</th>
</tr>
<c:forEach var="adm" items="${admList}">
<tr>
<td>${adm.userId}</td>
<td>${adm.userType}</td>
<td>${adm.userName}</td>
<td>${adm.password}</td>
<td><a href="editadm/${adm.userId}">Edit</a></td>
<td><a href="deleteadm/${adm.userId}">Delete</a></td>
</tr>
</c:forEach>
</table></center><br>
<center><h3><a href="Adminlogin.jsp">Back</a></h3></center>
</body>
</html>