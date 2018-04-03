<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Journeys</title>
	</head>
	<body style="font-family: consolas;font-size: 18px;">
		<form action="${pageContext.request.contextPath}/do-search-journeys.htm" method="post">
			<table>
				<tr>
					<td>Source :</td>
					<td>
						<input type="text" name="source"/>
					</td>
				</tr>
				<tr>
					<td>Destination: </td>
					<td>
						<input type="text" name="dest"/>
					</td>
				</tr>
				<tr>
					<td>Journey Date:</td>
					<td>
						<input type="text" name="journeyDt"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">Search</button>
					</td>
				</tr>
			</table>
		</form>	
	</body>
</html>







