<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<title>Student Confirmation</title>
<body>
	The student is confirmed: ${ student.firstName } ${ student.lastName } 
	<br><br>
	Age: ${ student.age }
	<br><br>
	Postal Code: ${ student.postalCode }
	<br><br>
	Course Code: ${ student.course }
	<br><br>
	Country: ${ student.country }
	<br><br>
	Favorite Language: ${ student.favoriteLanguage }
	<br><br>
	Operating Systems: 
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>