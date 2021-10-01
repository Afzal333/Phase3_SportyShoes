<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<center>
		<h3>Login</h3>
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
      <font color="red">Invalid Username/Password <br/><br/>
      </font>
		</c:if> 
		<form action="/login" method="post">
			<table>
				<tr>
					<td>User Name :</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Sign In" /></td>
				</tr>
			</table>
		</form><br><br><br>
		<jsp:include page="footer.jsp" />
	</center>
	
</body>
</html>