<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>purchase list></title>
</head>
<body >
<div align="center">
	<div class="container" id="purchaseTable"
		style="width: 1145px; margin-bottom: 180px;">
		
		<h1>Purchase Report </h1>
		<p> <b>Purchased Date - ${date }</b></p>
			<p> <b>Categories-Running, Walking and Training</b>  </p>
				<c:forEach items="${list}" var="reports">
					<p><b>Purchase Id</b> - ${reports.purchaseid}, <b>User</b> - ${reports.user}, <b>Product Id</b> - ${reports.productid}, <b>Product Name</b> - ${reports.product},<b>Product Category</b> - ${reports.category } </p>	
				</c:forEach>
		
</div>
</div>
</body>
</html>
