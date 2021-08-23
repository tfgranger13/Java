
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Info</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<h1>${dojo.name} Location Ninjas</h1>
	<table>
	    <thead>
	        <tr>
	            <th>First Name</th>
	            <th>Last Name</th>
	            <th>Age</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${dojo.ninjas}" var="ninja">
	        <tr>
	            <td><c:out value="${ninja.first_name}"/></td>
	            <td><c:out value="${ninja.last_name}"/></td>
	            <td><c:out value="${ninja.age}"/></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table><br>

<a href="/ninjas/new">Add a Ninja</a>
<a href="/dojos">Back to Dojos</a>
</body>
</html>