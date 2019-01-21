<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%-- <style type="text/css">
body {
	background-color: black;
}

div {
	text-align: center;
	background-color: grey;
	color: white;
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 40%;
	display: block;
}

a {
	color: yellow;
}
</style> --%>
<sb:head/>
</head>
<body>
	<div class="card text-center">
		<s:form action="AdminPanel" theme="bootstrap" label="Admin Panel" method="post">
			<s:hidden name="post" value="true"></s:hidden>
			<s:textfield name="id" cssStyle="text-align: center;" label="User ID"></s:textfield>
			<s:password name="password" cssStyle="text-align: center;" label="Password"></s:password>
			<s:submit value="Login" class="btn btn-primary"></s:submit>
		</s:form>
	</div>
</body>
</html>