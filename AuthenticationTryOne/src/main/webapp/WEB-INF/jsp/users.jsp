<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h2>Users</h2>

<table>
   <c:forEach items="${loginuser}" var="user" varStatus="count">
    <tr id="${count.index}">
    	<td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
    </tr>
 </c:forEach>
</table>
<hr><hr><hr>

<br><form action="/" method="GET"><input type="submit" value ="Go home"></form><br>


</body>
</html>

