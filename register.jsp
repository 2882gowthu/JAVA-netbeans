JSP Files:
register.jsp:
<%--
Document: register
Created on: 15 Nov, 2023, 6:15:40 PM
Author: Gowthami
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<style>
.registerconatiner
{
width: 100%;
height: auto;
text-align: center;
}
</style>
</head>
<body>
<div class = "registerconatiner">
<form method="post" action="register">
<label>Full Name:</label><br/>
<input type="text" placeholder="ENTER YOUR NAME" name="fname" required=""><br/>
<label>User Name:</label><br/>
<input type="text" placeholder="ENTER USER NAME" name="uname" required=""><br/>
<label>Email:</label><br/>
<input type="email" placeholder="ENTER YOUR EMAIL" name="email" required=""><br/>
<label>Password:</label><br/>
<input type="password" placeholder="ENTER YOUR PASSWORD" name="pswd" required=""><br/>
<span style="display: none">Enter Minimum 8 characters</span>
<label>Confirm Password:</label><br/>
<input type="password" placeholder=" RECONFIRM PASSWORD" name="cfmpswd" required=""><br/>
<span style="display: none">Both the passwords should match</span><br/>
<input type="submit" value="Register"><br/>
</form>
</div>
</body>
</html>
