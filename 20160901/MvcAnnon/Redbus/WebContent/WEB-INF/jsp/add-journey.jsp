<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Journey</title>
</head>
<body style="font-family: consolas; font-size: 18px">
	<h2>Add Journey</h2>
	<form:form modelAttribute="journey">
		<table>
			<tr>
				<td colspan="2"><span style="color: red;"> <form:errors
							path="*" />
				</span></td>
			</tr>
			<tr>
				<td>Source:</td>
				<td><form:input path="source" /></td>
			</tr>
			<tr>
				<td>Destination:</td>
				<td><form:input path="destination" /></td>
			</tr>
			<tr>
				<td>JourneyDate:</td>
				<td><form:input path="journeyDate" /></td>
			</tr>
			<tr>
				<td>Bus No:</td>
				<td><form:input path="busNo" /></td>
			</tr>

			<tr>
				<td>Amount:</td>
				<td><form:input path="amount" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="add" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>













