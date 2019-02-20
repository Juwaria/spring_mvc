<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Customer registration Form</title>
</head>

<style>
.errors {
	color: red
}
</style>

<body>


	<form:form action="processForm" modelAttribute="customer">
	Fill out the form. (*) means required: <br>
		<br>
		First name: <form:input path="firstName" />
		<br>
		<br>
		Last Name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="errors"></form:errors>
		<br>
		<br>
		Passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="errors"></form:errors>
		<br>
		<br>
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="errors"></form:errors>
		<br>
		<br>
		Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="errors"></form:errors>
		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>




</body>

</html>