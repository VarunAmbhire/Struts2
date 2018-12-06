<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<h1>Welcome on Home Page</h1>
	<s:property value="message" />
	<br>
	<s:property value="date" /><br>
	
	User Name : <s:property value="user"/><br>
	<s:property value="methodType"/>

	<s:form >
	<s:hidden name="post" value="true"></s:hidden>
	<s:textfield name="user"/>
		<s:submit key="Post" />
	</s:form>

</body>
</html>