<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<% String context = request.getContextPath(); %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<p>${test.password}</p>

<form action= "<%=context%>/board" method = "post">
	<input type = "text" name = "title"><br>
	<input type = "text" name = "context"><br>
	<input type = "submit" value = "send">
</form>
</body>
</html>
