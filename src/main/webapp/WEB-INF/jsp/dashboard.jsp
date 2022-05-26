<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="/sportyshoes/logout"><b>logout</b></a>
</div>

<div align="center">
<h2> Hello ${username}</h2>
<h4>Below are the Operations can perform</h4>
<a href="/sportyshoes/getListofProducts"><b>Get List of Products</b></a>
<a href="/sportyshoes/addproduct"><b>Add Product</b></a>
<a href="/sportyshoes/getUsersList"><b>Get List of Users</b></a>
<a href="/sportyshoes/getPurchaseList"><b>Get Purchased Reports</b></a>
</div>
</body>
</html>