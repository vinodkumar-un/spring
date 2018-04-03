<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<h2>Login</h2>
		<span style="color: red;">
			<%if(request.getParameter("error") != null){ 
				out.print("un/pwd not valid");
			}
			%>
		</span>
		<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
			Username: <input type="text" name="j_username"/>
			Password: <input type="password" name="j_password"/>
			<input type="submit" value="login"/>
		</form>		
		
	</body>
</html>










