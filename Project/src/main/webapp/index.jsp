<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<jsp:setProperty property="*" name="obj"/>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
}

.banner {
    width: 100%;
    height: 100vh;
    background-image: linear-gradient(rgba(0, 0, 0, 0.75), rgba(0, 0, 0, 0.75)), url(https://i.nextmedia.com.au/News/forensics_police.jpg);
    background-size: cover;
    background-position: center;
}

.navbar {
    width: 85%;
    height: 10px;
    margin: auto auto;
    padding: 35px 0;
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.logo {
    width: 120px;
    cursor: pointer;
}

.navbar ul li {
    list-style: none;
    display: inline-block;
    margin: 0 20px;
    position: relative;
}

.navbar ul li a {
    text-decoration: none;
    color: #fff;
    text-transform: uppercase;
}

.navbar ul li::after {
    content: '';
    height: 3px;
    width: 0;
    background: #009688;
    position: absolute;
    left: 0;
    bottom: -10px;
    transition: 0.5s;
}

.navbar ul li:hover::after {
    width: 100%
}
.content {
    width: 100%;
    position: absolute;
    top: 50%;
    transform: translateY(-50%);
    text-align: center;
    color: #fff;
}

.content h1 {
    font-size: 70px;
    margin-top: 80px;
    
}

.content p {
    margin: 20px auto;
    font-weight: 100;
    line-height: 25px;
    button {
    width: 200px;
    padding: 15px 0;
    text-align: center;
    margin: 20px 10px;
    border-radius: 25px;
    font-weight: bold;
    border: 2px solid #009688;
    background: transparent;
    color: white;
    cursor: pointer;
    position: relative;
}

span {
    background: #009688;
    height: 100%;
    width: 0;
    border-radius: 25px;
    position: absolute;
    left: 0;
    bottom: 0;
    z-index: -1;
    transition: 0.5s;
}

button:hover span {
    width: 100%;
}

button:hover {
    border: none;
}</style>
</head>
<body>
    <div class="banner">
        <div class="navbar">
            <img src="https://clipground.com/images/forensic-science-clipart-8.jpg" alt="logo" class="logo">
            <ul>
   <li> <a href="Admin.jsp">AdminLogin</a></li>
    <li><a href="Supervisor.jsp">SupervisorLogin</a></li>
    <li><a href="Officer.jsp">OfficerLogin</a></li>
    <li><a href="Guest.jsp">GuestLogin</a></li>
    <li><a href="Facilities.jsp">Facilties</a></li>
    </ul>
    </div>
    <div class="content">
            <h1>Forensic Management System</h1>
            
            
        </div>
    
</div>    
</body>
</html>