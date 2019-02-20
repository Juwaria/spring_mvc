<!-- Tag to be able to use pring tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName" />


		<br>
		<br>
	Last Name : <form:input path="lastName" />

		<br>
		<br>
	
	Country:
	
	<form:select path="country">
			<!--  	<form:option value="Brazil" label="Brazil" />
			<form:option value="USA" label="USA" />
			<form:option value="Saudi Arabia" label="Saudi Arabia" />
			<form:option value="India" label="India" />
			-->

			<!-- using list defined in the student class  -->
			<!-- use student.countryOptions if want to use
			from the class map -->

			<!-- using properties file -->
			<form:options items="${countryOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language:
		<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		<br>
		C <form:radiobutton path="favoriteLanguage" value="C" />
		<br>
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />
		<br>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		<br>


		<br>
		<br>
		Operating Systems:
		<br>
		<form:checkbox path="operatingSystems" value="Windows" /> Windows
		<form:checkbox path="operatingSystems" value="Mac OS"  /> Mac OS
		<form:checkbox path="operatingSystems" value="Linux" /> Linux
		

		<input type="submit" value="Submit" />

	</form:form>
</body>

</html>