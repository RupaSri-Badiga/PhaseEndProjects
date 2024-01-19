<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
	body{text-align: center;}
</style>
</head>
<body>
	<h1>Railway Crossing</h1><br>
	<h4>User Login</h4><br>
	<form action="login" method="post">
			<label for="email">Email:</label> 
			<input type="text" id="email" name="email" required><br> 
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" required><br>
			<button type="submit">Login</button>
		</form>
    <p>Don't have an account? <a href="userRegister.jsp">Create new one</a></p>
	
</body>
</html>