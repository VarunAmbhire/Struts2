<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
</head>
<body>
	<s:form action="Register">
		<span> <s:textfield key="First Name" name="vm.firstName" /> <s:label
				for="vm.firstName" name="labelFirstName" />
		</span>
		<span>
		<s:textfield key="Last Name" name="vm.lastName" />
		
			<s:label for="vm.lastName" name="labelLastName"/>
		</span>
		<span><s:textfield key="Email" name="vm.eMail" />
			<s:label for="vm.eMail" name="labelEmail"/></span>
		<span><s:textfield key="Address" name="vm.address" />
			<s:label for="vm.address" name="labelAddress"/></span>
		<span><s:submit value="Register" /></span>
	</s:form>
</body>
</html>