<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    margin: 0;
    padding: 0;
    background: #383a3d;
    font-family: arial;
}
.signup-form {
    width: 300px;
    text-align: center;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    color: #fff;
    padding: 20px;
    border: 2px solid #fff;
    border-radius: 10px;
}
.signup-form h1 {
    font-size: 42px;
    margin: 10px 0px 30px;
    font-weight: normal;
    color: #FFEB3B;
}
.signup-form input{
    display: block;
    width: 100%;
    padding: 0 16px;
    height: 44px;
    text-align: center;
    box-sizing: border-box;
    outline: none;
    border: none;
    margin: 20px 0;
    background: #fbfbfb;
    border-radius: 6px;
    transition: 0.8s;
}
.signup-form input:hover{
    transform: scale(1.05);
}
.signup-form button {
    margin: 30px 0px 15px;
    background: #FF9800;
    color: #fff;
    border-radius: 50px;
    cursor: pointer;
    transition: 0.8s;
    width: 100%;
    padding: 15px;
    border: none;
    font-size: 15px;
}
.signup-form button:hover{
    transform: scale(1.05);
}
.signup-form a{
    text-decoration: none;
    color: #fff;
    font-size: 14px;
    padding: 15px;
    transition: 0.8s;
    display: block;
}
.signup-form a:hover {
    background: rgb(38, 91, 142);
    border-radius: 50px;
}
</style>
<script> 
function validateForm() {  
    //collect form data in JavaScript variables  
    var pw1 = document.getElementById("pswd1").value;  
    var pw2 = document.getElementById("pswd2").value; 
    if(pw1 == "") {  
        document.getElementById("message1").innerHTML = "**Fill the password please!";  
        return false;  
      }  
      
      //check empty confirm password field  
      if(pw2 == "") {  
        document.getElementById("message2").innerHTML = "**Enter the password please!";  
        return false;  
      }   
       
      //minimum password length validation  
      if(pw1.length < 8) {  
        document.getElementById("message1").innerHTML = "**Password length must be atleast 8 characters";  
        return false;  
      }  
    
      //maximum length of password validation  
      if(pw1.length > 15) {  
        document.getElementById("message1").innerHTML = "**Password length must not exceed 15 characters";  
        return false;  
      }  
      
      if(pw1 != pw2) {  
        document.getElementById("message2").innerHTML = "**Passwords are not same";  
        return false;  
      }else {  
        alert ("Your account created successfully");  
      } 
      
      }
     
   
</script>  
</head>
<body data-rsssl=1>
    <div class="signup-form">
<form onsubmit ="return validateForm()" action="saveeeee" method="post">  
            <h1>Sign Up</h1>
             <input type="text" placeholder="fullname" name="fullName">
            <input type="email" placeholder="email@gmail.com" name="email">
            <input type="text" placeholder="username" name="userName">
<input type = "password" id = "pswd1" placeholder="create password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>   
<span id = "message1" style="color:red"> </span> 
<input type = "password" id = "pswd2" placeholder="confirm password" name="confirm_Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>   
<span id = "message2" style="color:red"> </span>
  <button type="submit">signup</button> 
           </form>
     
</div>

</body>
</html>