<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<%-- <style type="text/css">
table {
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
}

header {
	align-items: right;
}
</style> --%>
<sb:head />
</head>
<body>
	<header>
		Admin &nbsp;&nbsp; <a href="index.html">Log Out</a>
	</header>
	<s:form>
		<div>
			<h1>Account Details</h1>
			<table class="table table-striped">
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Amount</td>
					<td>isBlock</td>
				</tr>
				<s:iterator value="accounts" var="a" status="tr">
					<tr>
						<td><s:property value="%{#a.id}" /></td>
						<td><s:property value="#a.name" /></td>
						<td><s:property value="#a.amount" /></td>
						<td><s:property value="%{#a.block}" /></td>
						<td><s:form onsubmit="color(tr%{#a.index})">
								<s:hidden name="post" value="true"></s:hidden>
								<s:hidden id="block" name="block" value="%{#a.block}" />
								<s:hidden name="blockId" value="%{#a.id}" />
								<s:if test="block==1">
									<s:submit class="btn btn-primary" value="Unblock" style="background-color:red"/>
								</s:if>
								<s:else>
      									<s:submit class="btn btn-primary" value="Block"/>
                                </s:else>
							</s:form></td>
					</tr>
				</s:iterator>
			</table>
		</div>

		<div>
			<h1>Transactions</h1>
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
			</table>
		</div>
	</s:form>
	<script type="text/javascript">
		function color(i) {
			
			if (document.getElementById("block").value == 1) { 
  				document.getElementById(i).style.color = "red"
				console.log(i)
			}
		}
		color()
	</script>
</body>
</html>