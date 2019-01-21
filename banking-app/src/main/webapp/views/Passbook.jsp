<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
<%-- 
<style type="text/css">
body {
	text-align: center;
	background-color: black;
}

table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
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
<sb:head />
</head>

<body class="card">
	<div class="card text-center">
	<nav>
		<a href="Passbook">Passbook</a> &nbsp;<a href="Transaction">Do
			Transaction</a>&nbsp; <a href="index.html">LogOut</a>
		<p>
			User:
			<s:label name="name" value="%{name}"></s:label>
		</p>
	</nav>

	<div>
		<s:form theme="bootstrap">
			<table class="table table-striped">
				<tr>
					<td>Transaction Id</td>
					<td>Name</td>
					<td>Amount</td>
					<td>Type</td>
					<td>Account Id</td>
				</tr>
				<s:iterator value="transactions">
					<tr>
						<td><s:property value="txnId" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="ammount" /></td>
						<td><s:property value="type" /></td>
						<td><s:property value="account.id" /></td>
					</tr>
				</s:iterator>
				<tr>
					<td colspan="3">Total Amount:</td>
					<td colspan="2"><s:property value="%{totalAmount}" /></td>
				</tr>
			</table>
			<a href="Download">Download</a>
		</s:form>
</div>
	</div>
</body>
</html>