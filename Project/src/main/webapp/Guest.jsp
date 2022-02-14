<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: #383a3d;
  
}  
button {   
       background-color:green;
       width: 30%;      
		border-radius: 10px;
        color:white;
       padding: 10px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
 form {   
        border: 0px solid rgb(0, 128, 0);   
    }   
 input[type=text], input[type=password] {   
 		
        width: 30%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;  
        border-radius: 10px;  
       
         
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
 		width:30%;
        padding: 80px;   
        background-color:pink;
         border-radius: 10px; 
    } 
    .signin{
    width:20%;
     margin: 8px 0;  
      padding: 12px 20px;   
     display: inline-block
    
    }
</style>   
</head>
<body>
<center><br><br><br><br>
<div class="container"> 
<h1>Guest-Page</h1>
<div class="login" align="center">
<form action=Guestvalidation.jsp method="post">
UserName  <input type="text" placeholder="enter username" name="username"><br></br>
Password  <input type="password" placeholder="enetr password" name="password"><br></br>
<input type="submit" value="login">
</form>
</div></div>
</center>
</body>
</html>