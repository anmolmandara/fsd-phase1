<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task</title>
</head>
<body>

<form action="/adduser" method="post">

   <label for="name">Name:</label><input type="text" id="name" name="name" required><br>
   <label for="email">Email:</label><input type="text" id="email" name="email" required><br>
   <label for="username">Username:</label><input type="text" id="username" name="username" required><br>
   <label for="password">Password:</label><input type="password" id="password" name="password" required><br>
  <input type="submit" value="Submit">

</form>
</body>
</html>