<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
</head>


<body>
	<s:form>
		<s:hidden key="post" value="true" />
		<s:textfield key="Username" name="userName" />
		<s:password key="Password" name="password" />
		<s:submit value="Login" />
	</s:form>

	<s:fielderror name="user"></s:fielderror>
	<s:property value="message" />
</body>
</html>