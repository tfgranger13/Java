<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Template</title>
</head>
<body>
	<form method="POST" action="/submit">
    	<label>Your Name: <input type="text" name="submitName"></label><br>
    	<select name="submitLocation">
    		<option selected>Dojo Location:</option>
    		<option value="San Jose">San Jose</option>
    		<option value="Dallas">Dallas</option>
    		<option value="Online">Online</option>    		
    	</select><br>
    	<select name="submitLanguage">
    		<option selected>Favorite Language:</option>
    		<option value="Java">Java</option>
    		<option value="Java">Java</option>
    		<option value="Java">Java</option>    		
    	</select><br>
    	<button type="submit">Submit</button>
	</form>
</body>
</html>
