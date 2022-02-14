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
<h1> Edit Facilities Information </h1>
<form:form method="post" action="/Project/editsave">
 <form:hidden path="CaseFile_No"/> <br>
CaseFile_Type: <form:input path="CaseFile_Type"/> <br>
Evidence: <form:input path="Evidence"/> <br>
Case_Report: <form:input path="Case_Report"/> <br>
<input type="submit" value="Save changes">
</form:form>
</body>
</html>