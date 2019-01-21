<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<%-- <style type="text/css">
body {
	text-align: center;
	background-color: black;
}

div {
	align-content: center;
	text-align: center;
	background-color: grey;
	color: white;
	display: block;
	margin-left: auto;
	margin-right: auto;
	width: 40%;
	display: block;
	text-align: center;
}

a, p {
	color: yellow;
}
</style>
 --%>
</head>
<sb:head />
<body>
	<div class="card text-center">
	<header class="navbar navbar-dark">
		<a href="Passbook">Passbook</a>&nbsp; <a href="Transaction">Do
			Transaction</a>&nbsp; <a href="index.html">LogOut</a>

		<p>
			User:
			<s:label name="name" value="%{name}"></s:label>
		</p>
	</header>


		<s:form action="Transaction" theme="bootstrap" label="Transaction" method="post" onsubmit="return verify()">
			<s:hidden name="postTrans" value="true"></s:hidden>
			<s:textfield name="amount" id="amount" type="number"
				cssStyle="text-align: center;"></s:textfield>
			<br>
			<s:radio name="transactionType"
				list="#{'1':'Deposit','2':'Withdraw'}" value="1" />

			<s:submit value="Transaction" class="btn btn-primary center" onclick="verify()" />
		</s:form>
	</div>
	<script type="text/javascript">
		function verify() {
			var amount = document.getElementById("amount").value;
			if (amount < 0) {
				alert("Invalid Amount");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>