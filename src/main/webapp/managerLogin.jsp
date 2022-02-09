<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Reservation</title>
<style type="text/css"><%@include file="/Css.css" %></style>
</head>
<body>
	<header>
	<div class="name">Hotel Reservation</div>
	</header><hr>
	<h1 align="center">Manager Login</h1>
	<div class="r2">
	<form action="login" method="post">
		User Name <br><input type="text" name="mid" placeholder="Enter your username"><br>
		Password <br><input type="password" name="pwd" placeholder="Enter your password"><br>
		<input type="submit" id="btn1" name="submit" value="Login">
	</form>
	</div>	
</body>
</html>