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
	<div>
		<div>
			<h3>Users</h3>
			<form action="/user/search" method="post">
				<input type="text" name="search" id="search" /> <input
					type="submit" value="Search" />
			</form>
			</br>
			<form action="/user/customers" method="get">
				<input type="submit" value="View All" />
			</form>
			<br /> <br />
			<div>
				<div>
					<div>Users list</div>
				</div>
				<div>
					<table>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>EmailId</th>
							<th>Contact Number</th>
						</tr>
						<c:forEach var="user" items="${Users}">
							<tr>
								<td>${user.user_id}</td>
								<td>${user.user_name}</td>
								<td>${user.user_email}</td>
								<td>${user.contact_number}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>