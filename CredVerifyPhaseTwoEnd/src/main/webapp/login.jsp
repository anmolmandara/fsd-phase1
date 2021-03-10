<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="login" method="post">
		<label for="username">Enter Username:</label><br> 
		<input type="text"id="username" name="username"><br> 
		<label for="password">Enter password:</label><br> 
		<input type="password"id="password" name="password"><br>  
		<br> <input type="submit" value="Login"><br>
		<br><a href="makeAccount.jsp">Create new account</a><br>
		<br><a href="index.jsp">Go back home</a><br>
	</form>

</body>
</html>