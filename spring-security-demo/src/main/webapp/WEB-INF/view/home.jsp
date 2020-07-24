<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
	<h2>Spring Security Demo - Home Page</h2>
	<hr>
	<p>Welcome <security:authentication property="principal"/> as <security:authentication property="authorities"/> <p>
	<security:authorize access="hasRole('MANAGER')" >
		<hr>
		<p>
			<a href="${pageContext.request.contextPath}/leaders">Leaders access</a>
		</p>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')" >
		<hr>
		<p>
			<a href="${pageContext.request.contextPath}/systems">Admins access</a>
		</p>
	</security:authorize>
	<hr>
	<form:form 	action="${pageContext.request.contextPath}/logout" 
				method="POST">
		<input type="submit" value="Logout"/>
	</form:form>
</body>
</html>