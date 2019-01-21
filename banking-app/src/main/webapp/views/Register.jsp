<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

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
		<s:form action="Register" label="Register Form" theme="bootstrap" method="post" onsubmit="return verify()">
			<s:hidden name="postRegister" value="true"></s:hidden>
			<s:label name="id" label="Id" />
			<s:textfield name="name" label="Name"  id="name" cssStyle="text-align: center;"/>
			<s:textfield name="amount" label="Amount" id="amount" type="number" cssStyle="text-align: center;"/>
			<s:textfield name="password" label="Password" cssStyle="text-align: center;" />
			<s:submit value="Register" class="btn btn-primary"/>
		</s:form>
	</div>
	<script type="text/javascript">
	function verify(){
		var amount=document.getElementById("amount").value;
		if(amount<0){
			alert("Invalid Amount");
			return false;
		}
		if(document.getElementById("name").value==""){
			alert("Name required");
			return false;
		}
		return true;
	}		
	</script>
</body>
</html>