<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
</style>
 --%>
<sb:head />
</head>
<body>
	<div class="card text-center">
		<s:form action="Login" theme="bootstrap" method="post"
			cssClass="form-vertical" label="Login Form"
			onsubmit="return verify()">
			<s:hidden name="post" value="true"></s:hidden>
			<s:textfield name="id" id="id" label="User ID"
				cssStyle="text-align: center;"></s:textfield>
			<s:password name="password" label="Password"
				cssStyle="text-align: center;"></s:password>
			<s:submit value="Login" cssClass="btn btn-primary"></s:submit>
		</s:form>
	</div>
	<script type="text/javascript">
		function verify() {
			var id = document.getElementById("id").value;
			if (id == "") {
				alert("Id required");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>