<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
	body{text-align: center;}
</style>
</head>
<body>
	<h1>Railway Crossing</h1><br>
	<h4>User Register</h4><br>
	<form action="register" method="post">
			<label for="name">Name:</label> 
			<input type="text" id="name" name="name" required><br> 
			<label for="email">Email:</label>
			<input type="text" id="email" name="email" required><br>
			<label for="password">Password:</label> 
			<input type="password" id="password" name="password" required><br>
			<button type="submit">Register</button>
		</form>
    <p>Already have account? <a href="userLogin.jsp">Sign In</a></p>
	
</body>
</html>