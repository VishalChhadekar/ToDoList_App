<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h2>Welcome to the Note Taking App</h2>
	<h2>Add a new Note</h2><br>
	<form action="addnote"><br>
		Title: <input type="text" name="title"><br>
		Body: <textarea rows="10" cols="30" name="body"></textarea><br>
		<button type="submit">Add</button><br>
	</form>

</body>
</html>