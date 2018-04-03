<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Medicines</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<h2>Medicines Found</h2>
		<c:forEach items="${medicines}" var="medicine">
			Medicine : ${medicine.medicineName} - units : ${medicine.units}<br/>
		</c:forEach>		
	</body>
</html>











