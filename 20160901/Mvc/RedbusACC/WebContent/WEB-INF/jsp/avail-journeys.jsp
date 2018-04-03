<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Available Journeys</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<table>
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Journey Date</th>
				<th>Bus Type</th>
				<th>Amount</th>
			</tr>
			<c:forEach items="${journeys}" var="journey">
				<tr>
					<td>${journey.source}</td>
					<td>${journey.dest}</td>
					<td><fmt:formatDate value="${journey.journeyDt}" type="date"/></td>
					<td>${journey.busType}</td>
					<td>${journey.amount}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>





