<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
	<h2>Access Denied</h2>
	<hr>
	<p>
		You are not allowed to access this page
	</p>
	<hr>
	<a href="${pageContext.request.contextPath}/">Back home</a>
</body>
</html>