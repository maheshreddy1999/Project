<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Create Users</h1>
       <form:form method="post" action="saveeee">  
      	<table >
      	<tr>  
          <td>UserId : </td> 
          <td><form:input path="UserId" /></td>
         </tr>  
         <tr>  
          <td>UserType : </td> 
          <td><form:input path="UserType" /></td>
         </tr>  
         <tr>  
          <td>UserName :</td>  
          <td><form:input path="UserName" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:input path="Password"/> </td>
         </tr> 
         <tr>  
         <td></td>
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
