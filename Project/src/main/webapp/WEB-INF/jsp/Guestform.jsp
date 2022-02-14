<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Guest</h1>
       <form:form method="post" action="saveee">  
      	<table >
      	<tr>  
          <td>Gid : </td> 
          <td><form:input path="Gid"  /></td>
         </tr>  
         <tr>  
          <td>DeptName : </td> 
          <td><form:input path="DeptName"  /></td>
         </tr>  
         <tr>  
          <td>CaseFile_No :</td>  
          <td><form:input path="CaseFile_No" /></td>
         </tr> 
         <tr>  
          <td>CaseFile_Type :</td>  
          <td><form:input path="CaseFile_Type" /></td>
         </tr> 
         <tr>  
          <td>Case_Status :</td>  
          <td><form:input path="Case_Status" /></td>
         </tr> 
         <tr>  
          <td>Case_Desc :</td>  
          <td><form:input path="Case_Desc" /></td>
         </tr> 
         <tr>  
         <td></td>
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
