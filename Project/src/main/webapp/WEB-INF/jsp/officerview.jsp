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
<th>Off_id</th>  
<th>CaseFile_No</th>
<th>CaseFile_Type</th>
<th>Case_Status</th>
<th>Case_Desc</th>
<th>edit</th>
<th>delete</th>
</tr>
<c:forEach var="off" items="${offList}">
<tr>
<td>${off.off_id}</td>
<td>${off.caseFile_No}</td>
<td>${off.caseFile_Type}</td>
<td>${off.case_Status}</td>
<td>${off.case_Desc}</td>
<td><a href="editoff/${off.off_id}">Edit</a></td>
<td><a href="deleteoff/${off.off_id}">Delete</a></td>
</tr>
</c:forEach>
</table></center><br>
<center><h3><a href="Officerlogin.jsp">Back</a></h3></center>
</body>
</html>