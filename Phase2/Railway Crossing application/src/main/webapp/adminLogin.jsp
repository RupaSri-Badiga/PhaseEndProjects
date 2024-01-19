<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.panel{
	text-align: 'center';
	}
</style>

</head>
<body>
	<div class="panel">
		<h2>Railway Crossing</h2> <br>
		<h4>Admin Login</h4> <br>
		<form action="adminLogin" method="post">
			<label for="email">Email:</label> <br>
			<input type="text" id="email"name="email" required><br> 
			<label for="password">Password:</label> <br>
			<input type="password" id="password" name="password" required><br>
			<button type="submit">Login</button> <br>
		</form>
	</div>

</body>
</html>