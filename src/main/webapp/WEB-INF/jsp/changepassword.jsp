<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password Page</title>
</head>
<body>
<div align="center">
<h2> Change Password Page</h2>
<form method="post" action="/sportyshoes/changepassword/changepasswordview">   
		<table>
			<tr>
				<td><b>User Name</b></td>
				<td><input name="username" /></td>
			</tr>
			<tr>
				<td><b>Old Password</b></td>
				<td><input name="oldpassword" /></td>
			</tr>
			<tr>
				<td><b>New Password</b></td>
				<td><input name="newpassword" /></td>
			</tr>
			<tr>
				<td><b>Confirm New Password</b></td>
				<td><input name="confnewpassword" /></td>
			</tr>
		</table>
		<input type="submit" />
		
	</form>
	</div>
</body>
</html>