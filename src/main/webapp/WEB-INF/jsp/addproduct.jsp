<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<div align="right">
<a href="/sportyshoes/logout"><b>logout</b></a>
</div>
<div align="center">
<h2> Add Product Page</h2>
<form method="post" action="/sportyshoes/addproduct/addproductview">  
		<table>
			<tr>
				<td><b>Product Name</b></td>
				<td><input name="productname" /></td>
			</tr>
			<tr>
				<td><b>Product Description</b></td>
				<td><input name="product_desc" /></td>
			</tr>
			<tr>
				<td><b>Price</b></td>
				<td><input name="price" /></td>
			</tr>
			<tr>
				<td><b>Category</b></td>
				<td><input name="category" /></td>
			</tr>
			<tr>
				<td><b>Brand</b></td>
				<td><input name="brand" /></td>
			</tr>
			<tr>
				<td><b>Gender</b></td>
				<td><input name="gender" /></td>
			</tr>
		</table>
		<input type="submit" value="Add Product"/>
		
	</form>
	</div>
</body>
</html>