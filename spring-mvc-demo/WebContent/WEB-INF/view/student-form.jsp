<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
	<style>
		.error { color:red }
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		Age: <form:input path="age"/>
		<form:errors path="age" cssClass="error" />
		<br><br>
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error" />
		<br><br>
		Course Code: <form:input path="course"/>
		<form:errors path="course" cssClass="error" />
		<br><br>
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		Favorite Language:
		JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>