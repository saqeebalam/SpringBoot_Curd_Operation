<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2 style="text-align:center;">Login Page</h2>
 	<form action="verifyLogin" method="post">
  		Email<input type="text" name="userid"/>
  		<br>
  		Password<input type="password" name="password"/>
  		<br>
  		<input type="submit" value="LOGIN">
	</form>
 	
</body>
</html>