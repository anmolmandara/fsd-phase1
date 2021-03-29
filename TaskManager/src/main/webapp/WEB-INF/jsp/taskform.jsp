<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task</title>
</head>
<body>

<form action="/addtask" method="post">

   <label for="name">Task Name:</label><input type="text" id="name" name="name" required><br>

<label for="desc">Description:</label><br><textarea id="desc" name="desc" rows=10 cols=30 required></textarea><br>
 
  <label for="sdate">Start Date:</label><br><input type="date" id="sdate" name="sdate" required><br>
  <label for="edate">End Date:</label><br><input type="date" id="edate" name="edate" required><br>
  <label for="email">Email:</label><input type="text" id="email" name="email" required><br>
  
  
  
  <label for="sev">Severity</label><br>
  <select id="sev" name="sev" required>
  	<option value="High">High</option>
  	<option value="Medium">Medium</option>
  	<option value="Low">Low</option>
  </select>
  
   
  <br>
  <input type="submit" value="Submit">

</form>
</body>
</html>