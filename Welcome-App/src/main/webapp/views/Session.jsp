<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>

	Old Count:
	<s:property value="counter.getOldCount()"/>
	<br> New Count:
	<s:property value="counter.newCount" />

</body>
</html>