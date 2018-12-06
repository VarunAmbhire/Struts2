<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>

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
<body class="container-fluid">

	<s:form class="form-group" action="Edit" method="post">
		<s:hidden name="editPost" value="true" />
		<s:textfield class="form-control" name="editName" key="Name" />
		<s:label for="editName" name="labelName" />
		<s:textfield class="form-control" name="editNumber" key="Number" />
		<s:label for="editNumber" name="labelNumber" />
		<s:textfield class="form-control" name="editAddress" key="Address" />
		<s:label for="editAddress" name="labelAddress" />
		<s:submit class="form-control btn btn-primary" value="Edit"></s:submit>
	</s:form>
</body>
</html>