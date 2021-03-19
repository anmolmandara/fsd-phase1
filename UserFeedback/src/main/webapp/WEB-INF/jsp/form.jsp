<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/addfeedback" method="post">
		<br><label for="comments">Comment:</label><input type="text" id="comments" name="comments" required><br>
		<br><label for="rating">Rating:</label><input type="number" id="rating" name="rating" required><br>
		<br><label for="user">Name:</label><input type="text" id="user" name="user" required><br>
		<br><input type="submit" value ="Submit"><br>
		</form>
		
</body>
</html>