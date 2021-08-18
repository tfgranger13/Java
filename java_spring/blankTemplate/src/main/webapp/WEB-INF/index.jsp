<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Template</title>
    
    <!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
</head>
<body>
	Template
	
	<form method="POST" action="/login">
		<label>Username: <input type="text" name="username"></label>
		<label>Password: <input type="password" name="password"></label>
		<button>Login</button>
	</form>
	
	<c:out value="${2+2}"/>
	
	<c:out value="${someAttribute}"/>
	
	<c:forEach var="oneDojo" items="${dojosFromMyController}">
		<p><c:out value="${oneDojo}"></c:out></p>
	</c:forEach>
	
</body>
</html>
