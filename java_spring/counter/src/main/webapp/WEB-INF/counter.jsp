
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit counter</title>
</head>
<body>
	You have visited the page <c:out value="${dispCount}"/> times.
	<a href="/">Test again.</a>
</body>
</html>