<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Journey</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<form:form commandName="journey">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			<table>
				<tr>
					<td>Source</td>
					<td>
						<form:input path="source"/>
					</td>
				</tr>
				<tr>
					<td>Destination</td>
					<td>
						<form:input path="dest"/>
					</td>
				</tr>
				<tr>
					<td>Journey Date:</td>
					<td>
						<form:input path="journeyDate"/>
					</td>
				</tr>
				<tr>
					<td>Amount</td>
					<td>
						<form:input path="amount"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">Add</button>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>









