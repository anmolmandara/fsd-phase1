<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Hello</title>
    </head>
    <body>
        <h1>Hello! Login Successful</h1>
        <br>
        <form action="/login?logout=true" method="post">
        <input type="submit" value="Log out">
        </form>
        
        
    </body>
</html>