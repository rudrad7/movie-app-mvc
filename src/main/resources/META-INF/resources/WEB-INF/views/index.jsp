<%@ page language="java" contentType="text/html; charset=ISO-8859-1"


    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h3>Vaishali Login page</h3>
<form action="validateLogin" method="post">
<input type="text" name="txtName"/>
<input type="password" name="txtPwd"/>
<input type="submit" name="btnLogin" value="LOGIN"/>
</form>
</body>
<a href="/movie/showAddMovieForm">Show AddMovie Form</a>
</html>