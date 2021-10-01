<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<center>
	<p><a href="/product"> Manage Products </a></p>
	<p><a href="/user/customers"> Manage Customers </a></p>
	<p><a href="/purchase/purchaseReport"> Show Purchase History </a></p>
	<p><a href="/user/changePasswordShow"> Change Password </a></p>
	<p><a href="/logout"> Log Out </a></p>
	</center>
	
</body>
</html>