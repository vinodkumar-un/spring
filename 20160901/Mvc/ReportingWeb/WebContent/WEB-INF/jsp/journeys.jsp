<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Today's Journeys</title>
	</head>
	<body style="font-family: consolas;font-size: 18px;">
		<table>
			<tr>
				<td><a href="${pageContext.request.contextPath}/day-journeys.htm?view=pdf">Pdf</a></td>
				<td>&nbsp;</td>
				<td><a href="${pageContext.request.contextPath}/day-journeys.htm?view=xls">Excel</a></td>
			</tr>
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Bus No</th>
			</tr>
			<c:forEach items="${journeys}" var="journey">
				<tr>
					<td>${journey.source}</td>
					<td>${journey.destination}</td>
					<td>${journey.busNo}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>








