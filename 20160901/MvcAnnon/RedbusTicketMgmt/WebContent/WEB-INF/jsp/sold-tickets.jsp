<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Sold Tickets</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<h1>Sold Tickets</h1>
		<table>
			<c:forEach items="${tickets}" var="ticket">
				<tr>
					<td>
						<b>${ticket.ticketNo}</b>
						<i>${ticket.holderName}</i>
						${ticket.journeyDate}
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>





