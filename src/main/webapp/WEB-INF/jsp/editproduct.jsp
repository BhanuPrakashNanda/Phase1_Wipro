<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product Page</title>
</head>
<body>

<div align="center">
<h2>Edit Product Page</h2>
<form method="post" action="/sportyshoes/editproduct">  
		<table>
			<tr>
				<td>Product Id</td>
				<td><input name="productid" value=${editProductObj.productid} /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input name="productname" /></td>
			</tr>
			<tr>
				<td>Product Description</td>
				<td><input name="product_desc" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input name="price" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><input name="category" /></td>
			</tr>
			<tr>
				<td>Brand</td>
				<td><input name="brand" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input name="gender" /></td>
			</tr>
		</table>
		<input type="submit" value="Edit Product"/>
		
	</form>
	</div>
</body>
</html>