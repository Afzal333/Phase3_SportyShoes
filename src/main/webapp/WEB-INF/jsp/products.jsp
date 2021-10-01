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
     <jsp:include page="header.jsp"/>
	<div>
		<div>
			<h2>Manage Products</h2>
			<br />
			<a href="/product/add-new">
				<button type="submit">Add new Product</button>
			</a> <br /> <br />
			<div>
				<div>
					<div>Product list</div>
				</div>
				<div>
					<table>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Category</th>
							<th>Price</th>
							<th>Update</th>
							<th>Delete</th>
	  				</tr>
						<c:forEach var="product" items="${Products}">
							<tr>
								<td>${product.product_id}</td>
								<td>${product.product_name}</td>
								<td>${product.product_category.category_name}</td>
								<td>${product.price}</td>
								<td><form action="/product/${product.product_id}" method="post">
										<input type="submit" value="Edit" />
									</form></td>

								<td><form action="/product/${product.product_id}/delete" method="post">
										<input type="submit" value="Delete" />
									</form></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>