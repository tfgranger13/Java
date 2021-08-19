
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<h1>All Languages</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Name</th>
	            <th>Creator</th>
	            <th>Current Version</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${languages}" var="language">
	        <tr>
	            <td><a href="languages/${language.id}/show"><c:out value="${language.name}"/></a></td>
	            <td><c:out value="${language.creator}"/></td>
	            <td><c:out value="${language.currentVersion}"/></td>
	            <td><a href="/languages/${language.id}/delete">Delete</a> <a href="/languages/${language.id}/edit">Edit</a></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table><br>
	<a href="/languages/new">New Language</a>
	
	
	
	
	
</body>
</html>