<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Signup</h1>
       <form:form method="post" action="save">  
      	<table >
      	<tr>  
          <td>FullName: </td> 
          <td><form:input path="FullName"  /></td>
         </tr>  
         <tr>  
          <td>Email : </td> 
          <td><form:input path="Email"  /></td>
         </tr>  
         <tr>  
          <td>UserName:</td>  
          <td><form:input path="UserName" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:input path="Password" /></td>
         </tr> 
         <tr>  
          <td>Confirm_Password :</td>  
          <td><form:input path="Confirm_Password" /></td>
         </tr> 
         <tr>  
         <td></td>
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
