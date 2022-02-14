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

</style>
</head>
<body><center><br><br>
<table border="2">
<tr>
<th>Gid</th>
<th>DeptName</th>  
<th>CaseFile_No</th>
<th>CaseFile_Type</th>
<th>Case_Status</th>
<th>Case_Desc</th>
<th>edit</th>
<th>delete</th>
</tr>
<c:forEach var="gus" items="${gusList}">
<tr>
<td>${gus.gid}</td>
<td>${gus.deptName}</td>
<td>${gus.caseFile_No}</td>
<td>${gus.caseFile_Type}</td>
<td>${gus.case_Status}</td>
<td>${gus.case_Desc}</td>
<td><a href="editgus/${gus.gid}">Edit</a></td>
<td><a href="deletegus/${gus.gid}">Delete</a></td>
</tr>
</c:forEach>
</table></center><br>
<center><h3><a href="GuestLogin.jsp">Back</a></h3></center>
</body>
</html>