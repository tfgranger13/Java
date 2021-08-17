<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Template</title>
</head>
<body>
	Results:<br>
	Name: <c:out value="${name}"/><br>
	Location: <c:out value="${location}"/><br>
	Favorite Language: <c:out value="${language}"/><br>
</body>
</html>