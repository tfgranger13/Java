<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Single View</title>
</head>
<body>
	<a href="/languages">Home</a>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<h1><c:out value="${language.name}"/></h1>
	<p>Creator: <c:out value="${language.creator}"/></p>
	<p>Current Version: <c:out value="${language.currentVersion}"/></p>
	<a href="/languages/${language.id}/edit">Edit Language</a>
	<form action="/languages/${language.id}" method="post">
	    <input type="hidden" name="_method" value="delete">
	    <input type="submit" value="Delete">
	</form>
</body>
</html>