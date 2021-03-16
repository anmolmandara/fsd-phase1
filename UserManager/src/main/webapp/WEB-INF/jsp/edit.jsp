<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Update User</title>
<style>
table, th, td {border: 1px solid black;}
</style>
</head>
<body>
<div>
<table>
   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
    <tr id="${count.index}">
    	<td>${users.id}</td>
        <td>${users.name}</td>
        <td>${users.email}</td>
        <td>${users.password}</td>
    </tr>
</table>
</div>
<br>
<div>

<form action="/update" method="post">
		<br><label for="id">Confirm Id:</label><input type="number" id="id" name="id" required><br>
		<br><label for="name">Change Name:</label><input type="text" id="name" name="name" required><br>
		<br><label for="email">Change Email:</label><input type="text" id="email" name="email" required><br>
		<br><label for="password">Change Password:</label><input type="text" id="password" name="password" required><br>
		<br><input type="submit" value ="Submit"><br>
		</form>
	
</div>
</body>
</html>