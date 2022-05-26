<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>product list</title>
</head>
<body >
<div align="right">
<a href="/sportyshoes/logout"><b>logout</b></a>
</div>
<div align="center">
	<div class="container" id="productTable"
		style="width: 1145px; margin-bottom: 180px;">
		<h2>Product Management</h2>
		<h3>The List of Products in our Database</h3>
		
		<table border ="1" class="table table-hover" id="productList">
			<thead>
				<tr>
					
					<th><b>Product Id</b></th>
					<th><b>Product Name</b></th>
					<th><b>Product Description</b></th>
					<th><b>Price</b></th>
					<th><b>Category</b></th>
					<th><b>Brand</b></th>
					<th><b>Gender</b></th>
			
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product">
					<tr>
					
						<td>${product.productid}</td>
						<td>${product.productname}</td>
						<td>${product.product_desc}</td>
						<td>${product.price}</td>
						<td>${product.category}</td>
						<td>${product.brand}</td>
						<td>${product.gender}</td>
						<td><a href="sportyshoes/delete/${product.productid}">Delete Product</a>
						<td><a href="sportyshoes/edit/${product.productid}">Edit Product</a>
						
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
</div>
</body>
</html>
