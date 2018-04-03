<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Medicines</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<h2>Search Medicines</h2>
		<form action="${pageContext.request.contextPath}/do-search-medicines.htm" method="post">
			<table>
				<tr>
					<td>Medicine Name:</td>
					<td><input type="text" name="medicineName"/></td>
				</tr>
				<tr>
					<td>Composition:</td>
					<td><input type="text" name="composition"/></td>
				</tr>
				<tr>
					<td>Manufacturer:</td>
					<td><input type="text" name="manufacturer"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="search"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>










