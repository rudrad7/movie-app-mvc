<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Customer Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
<h1> Spring MVC 5 - Form Validation Example</h1>
<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>
	<form:form action="addMovie" modelAttribute="movie">
			MovieId: <form:input path="movieId" />
			<br><br>
		Moviename (*): <form:input path="movieName" />
		<form:errors path="movieName" cssClass="error" />
			<br>
		<br><br>
		<input type="submit" value="Add Movie" />
				
	</form:form>

</body>

</html>










