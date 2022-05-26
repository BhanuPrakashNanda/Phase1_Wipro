<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>Welcome To ShortyShoes Ecommerce Website</h2>
	<form action="/sportyshoes/login" method="get">  
		<table>
			<tr>
				<td>UserName</td>
				<td><input name="username" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input name="password" /></td>
			</tr>
		</table>
		<input type="submit" />
		<a href="/sportyshoes/changepassword">Change Password</a> 
	</form>
	</div>
</body>
</html>