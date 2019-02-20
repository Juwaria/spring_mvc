<!-- Tag to be able to use spring tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Can use JSTL tags now -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Confirmation</title>
</head>
<body>

	The Customer is confirmed: ${customer.firstName} ${customer.lastName }
	
	<br><br>
	Number of Passes: ${customer.freePasses}
	<br><br>
	Postal Code: ${customer.postalCode}
	<br><br>
	Course Code: ${customer.courseCode }
	<br><br>
</body>

</html>