<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:blue">Find Case details</h1>
<form action="FacilitiesServlet" method="post">
   CaseFile_No: <input type="text" name="casefile_no"/><br>
   <input type="submit" value="Get Case Details">
   <input type="reset" value="Cancel">
</form>
</body>
</html>