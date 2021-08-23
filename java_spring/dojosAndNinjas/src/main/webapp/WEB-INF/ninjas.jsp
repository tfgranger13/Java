
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
   

	<h1>New Ninja</h1>
	<form:form action="/newninja" method="post" modelAttribute="ninja">
	    
	    <p>
	        <form:label path="first_name">First Name:</form:label>
	        <form:errors path="first_name"/>
	        <form:input path="first_name"/>
	    </p>
	    <p>
	        <form:label path="last_name">Last Name:</form:label>
	        <form:errors path="last_name"/>
	        <form:input path="last_name"/>
	    </p> 
	    <p>
	        <form:label path="age">Age:</form:label>
	        <form:errors path="age"/>
	        <form:input path="age"/>
	    </p> <p>
	        <form:label path="dojo">Dojo:</form:label>
	        <form:errors path="dojo"/>
	        <form:select path="dojo">
	        	<c:forEach items='${dojos}' var='dojo'>
	        		<form:option value="${dojo.id}">
	        			<c:out value="${dojo.name}"/>
	        		</form:option>
	        	</c:forEach>
	        </form:select>
	    </p>
	    <input type="submit" value="Submit">
	</form:form>
<a href="/dojos">Back to Dojos</a>
</body>
</html>