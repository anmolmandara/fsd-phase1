<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<form action="register" method="post">
		<label for="name">Enter Name:</label><br> 
		<input type="text"id="name" name="name"><br> 
		<label for="email">Email:</label><br> 
		<input type="text"id="email" name="email"><br> 
		<label for="username">Username:</label><br> 
		<input type="text"id="username" name="username"><br> 
		<label for="password">Password:</label><br> 
		<input type="password"id="password" name="password"><br> 
		<br> <input type="submit" value="Create Account"><br>
	</form>
	
	<br><a href="index.jsp">Go back home</a><br>
</body>
</html>