<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="2">
<tr>
<th>CaseFile_No</th>
<th>CaseFile_Type</th>  
<th>Evidence</th>
<th>Case_Report</th>
 <th>edit</th>
<th>delete</th>
</tr>
<c:forEach var="fac" items="${facList}">
<tr>
<td>${fac.caseFile_No}</td>
<td>${fac.caseFile_Type}</td>
<td>${fac.evidence}</td>
<td>${fac.case_Report}</td>
<td><a href="editfac/${fac.caseFile_No}">Edit</a></td>
<td><a href="deletefac/${fac.caseFile_No}">Delete</a></td>
</tr>
</c:forEach>
</table><br>
<center><h3><a href="FacilitiesLogin.jsp">Back</a></h3></center>
</center></body>
</html>