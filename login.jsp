login.jsp:
<%--
Document: login
Created on: 16 Nov, 2023, 1:01:26 PM
Author: Gowthami
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body align="center">
<form method="post" action="login">
<label>User Name:</label><br/>
<input type="text" placeholder="ENTER USER NAME" name="uname" required=""><br/>
<label>Password:</label><br/>
<input type="password" placeholder="ENTER YOUR PASSWORD" name="pswd" required=""><br/><br/>
<input type="submit" value="Login"><br/>
</form>
</body>
</html>
