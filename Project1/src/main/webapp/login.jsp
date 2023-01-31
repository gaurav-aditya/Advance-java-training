<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> LOGIN</title>
</head>
<body>
<div align=center>
<h1>USER LOGIN</h1>
</div>

<form action=Login1Servlet method= post>
<table>
<tr><td>Enter Name: </td><td><input type="text" name="txtName"></td></tr>
		
<tr><td>Enter password:</td><td> <input type="password" name="txtPwd"></td></tr>
		
<tr><td><input type=submit value=Login> </td><td><input type=reset></td></tr>
</table>
</form>

</body>
</html>