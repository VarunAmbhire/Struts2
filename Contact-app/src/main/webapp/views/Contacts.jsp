<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<script type="text/javascript">
		function alertDelete(){
			if(confirm("Do u really want to delete???")){
				return true;
			}else{
				return false;
			}
		}	
	
	</script>

	<div>
		<a href="Add">Add</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<s:if test="user">
			<a href="LogOut">Log Out</a>
		</s:if>		
	</div>

	<div>
		<table class="table">
			<tr>
				<td>Name</td>
				<td>Number</td>
				<td>Address</td>
			</tr>
				<s:iterator value="list" status="incr">

			<tr>
					<td><s:property value="name" /></td>
					<td><s:property value="number" /></td>
					<td><s:property value="address" /></td>
					<td><s:form action="Edit?index=%{#incr.index}">
							<s:submit value="Edit" />
						</s:form></td>
						<td><s:form action="Delete?index=%{#incr.index}" onsubmit="return alertDelete()">
							<s:submit value="Delete" />
						</s:form></td>
			</tr>				</s:iterator>

		</table>
	</div>

</body>
</html>