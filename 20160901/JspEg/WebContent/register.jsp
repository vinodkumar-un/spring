<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Register</title>
	</head>
	<body>
		<form action="doRegistration">
		    City:
			<select name="city">
				<%
					java.util.List<String> cities = (java.util.List<String>) request.getAttribute("cities");
					for(String city : cities) {
						out.print("<option value='"+city+"'>"+city+"</option>");
					}
				%>		
			</select>
			<input type="submit" value="register"/>
		</form>
	</body>
</html>













