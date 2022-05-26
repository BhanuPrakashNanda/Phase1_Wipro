<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User List</title>
</head>
<body >
<div align="right">
<a href="/sportyshoes/logout"><b>logout</b></a>
</div>
<div align="center">
	<div class="container" id="userTable"
		style="width: 1145px; margin-bottom: 180px;">
		<h2>Users Page</h2>
		<h3>The List of Users in our Database</h3>
		
		<table border ="1" class="table table-hover" id="userList">
			<thead>
				<tr>
					
					<th><b>UserName</b></th>
					<th><b>Password</b></th>
					<th><b>Address</b></th>
					<th><b>Mobile</b></th>
					<th><b>EmailID</b></th>
					
			
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
					
						<td>${user.username}</td>
						<td>${user.password}</td>
						<td>${user.address}</td>
						<td>${user.mobile}</td>
						<td>${user.emailid}</td>
						
					
						
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
</div>
</body>
</html>
