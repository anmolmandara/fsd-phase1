<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Update Task</title>
<style>
table, th, td {border: 1px solid black;}
</style>
</head>
<body>
<div>
<table>
   
   <tr><th>ID</th><th>Description</th><th>Email</th><th>Start Date</th><th>End Date</th><th>Name of task</th><th>Severity</th></tr>
    <tr id="${count.index}">
    	<td>${task.id}</td>
        <td>${task.description}</td>
        <td>${task.email}</td>
        <td>${task.startDate}</td> 
        <td>${task.endDate}</td>
        <td>${task.name}</td>  
        <td>${task.severity}</td> 
        <td>${task.user}</td>
    </tr>
</table>
</div>
<br>
<div>

  <form action="/update" method="post">
		<br><label for="id">Confirm Id:</label><input type="number" id="id" name="id" required><br>
		<br><label for="name">Change Name:</label><input type="text" id="name" name="name" required ><br>
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
  
		<br><input type="submit" value ="Submit"><br>
		</form>
	
</div>
</body>
</html>