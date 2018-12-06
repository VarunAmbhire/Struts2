<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style type="text/css">
.errorMessage {
	color: red;
}
</style>

</head>
<body class="container">
	<s:form class="form form-group" action="Add" method="post">
		<s:hidden name="post" value="true" />
		<s:textfield class="form-control" name="addName" key="Name"></s:textfield>
		<s:label for="addName" name="labelName"></s:label>
		<s:textfield class="form-control" name="addNumber" key="Number"></s:textfield>
		<s:label for="addNumber" name="labelNumber"></s:label>
		<s:textfield class="form-control" name="addAddress" key="Address"></s:textfield>
		<s:label for="addAddress" name="labelAddress"></s:label>
		<s:submit class="form-control btn btn-primary" value="Add"></s:submit>
	</s:form>
</body>
</html>