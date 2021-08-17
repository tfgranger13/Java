<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Template</title>
</head>
<body>
	Template
	<form method="POST" action="/login">
    	<label>Username: <input type="text" name="username"></label>
    	<label>Password: <input type="password" name="password"></label>
    	<button>Login</button>
	</form>
</body>
</html>
