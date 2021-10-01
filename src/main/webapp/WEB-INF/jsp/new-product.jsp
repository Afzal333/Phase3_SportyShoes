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
	<div>
		<center>
		<h3>Add New Product</h3>
            <div>
                <form:form action="/product/save" modelAttribute="Product" method="post">
                    <div>
                        <p>
                            <form:label path="product_name">Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                            <form:input type="text" id="name" path="product_name"/>
                            <form:errors path="product_name" />
                        </p>
                        <p>
                            <form:label path="product_category.category_name">Category</form:label>
                            <form:input type="text" id="category" path="product_category.category_name"/>
                            <form:errors path="product_category.category_name" />
                        </p>
                         <p>
                            <form:label path="price">Price&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</form:label>
                            <form:input type="text" id="price" path="price"/>
                            <form:errors path="price" />
                        </p>
                        
                    </div>
                    <div>
                        <div>
                            &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Add Product">
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </center>
    </body>
</html>