<%@page import="com.todo.entity.Note"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Notes</title>
</head>
<body>
	<h1>View all Notes</h1>
	<c:forEach var="item" items="${allnotes }">
		<h3>${item.getTitle()}</h3>
		<p>${item.getBody()}</p>
	</c:forEach>


</body>
</html>