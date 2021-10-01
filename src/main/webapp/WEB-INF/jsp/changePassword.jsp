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
		<h3>Change Password</h3>
		<form action="/user/changePasswordSubmit" method="post">
			<table>
				<tr>
					<td>Current Password:</td>
					<td><input type="password" name="currentPassword" /></td>
				</tr>
					<tr>
					<td>New Password:</td>
					<td><input type="password" name="newPassword"/></td>
				</tr>					
				<tr>
					<td colspan="2" align="right"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>