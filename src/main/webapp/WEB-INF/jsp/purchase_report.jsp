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
			<h3>Purchase Report</h3>
			<form action="/purchase/search" method="post">
				Purchase Date : <input type="text" name="purchasedate"
					id="purchasedate" /> Category: <input type="text" name="category"
					id="category" /> <input type="submit" value="Search" />
			</form>
			</br>
			<form action="/purchase/purchaseReport" method="get">
				<input type="submit" value="View All" />
			</form>
			<br /> <br />
			<div>
				<div>
					<div>Purchase Report</div>
				</div>
				<div>
					<table>
						<tr>
							<th>Id</th>
							<th>Purchase Date</th>
							<th>Buyer Name</th>
							<th>Product Name</th>
							<th>Product Category</th>
							<th>Product Price</th>
						</tr>
						<c:forEach var="precord" items="${PurchaseRecords}">
						<c:forEach var="product" items="${precord.products}">
							<tr>
								<td>${precord.purchase_id}</td>
								<td>${precord.purchase_date}</td>
								<td>${precord.user.user_name}</td>
								<td>${product.product_name}</td>
								<td>${product.product_category.category_name}</td>
								<td>${product.price}</td>
							</tr>
						</c:forEach>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>