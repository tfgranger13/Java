<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
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
