<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Journeys</title>
	</head>
	<body>
		<table>
			<tr>
				<th>Id</th>
				<th>source</th>
				<th>destination</th>
			</tr>
			<c:forEach items="${journeys}" var="journey">
				<tr>
					<td>
						<a href="${pageContext.request.contextPath}/edit-journey.htm?jId=${journey.journeyId}">${journey.journeyId}</a>
					</td>
					<td>${journey.source}</td>
					<td>${journey.destination}</td>
				</tr>
			</c:forEach>
		</table>	
	</body>
</html>












