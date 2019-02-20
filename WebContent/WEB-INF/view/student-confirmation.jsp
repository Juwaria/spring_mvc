<!-- Tag to be able to use spring tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Can use JSTL tags now -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Confirmation Page</title>
</head>
<body>

	The Student is confirmed: ${student.firstName} ${student.lastName }
	
	<br><br>
	
	Country: ${student.country}
	
	Favorite Language: ${student.favoriteLanguage }
	<br><br>
	<!-- This is an array as multiple options can be picked by the user-->
	Operating Systems: 
	<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li> ${temp}</li>
	</c:forEach>
	</ul>
	
</body>

</html>