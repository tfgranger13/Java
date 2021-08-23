
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>testing</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<h1>All Dojos</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Name</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${dojos}" var="dojo">
	        <tr>
	            <td><c:out value="${dojo.name}"/></td>
	            <td><a href="/dojos/${dojo.id}">View Ninjas</a></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table><br>
	
	<h1>New Dojo</h1>
	<form:form action="/newdojo" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>
<a href="/ninjas/new">Add a Ninja</a>
</body>
</html>