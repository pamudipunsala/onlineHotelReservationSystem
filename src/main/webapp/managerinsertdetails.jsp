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
	<h1 align="center">Insert Manager Details</h1>
	<div class="r2">
	<form action="insertDtl" method="post">
		Name <br><input type="text" name="mname"><br>
		Phone No <input type="text" name="pnum"><br>
		Address <input type="text" name="add"><br>
		User Name <input type="text" name="uname"><br>
		Password <input type="password" name="pwd"><br>
		
		<input type="submit" name="submit" id="btn1" value="Submit">
	</form>
	</div>
	
</body>
</html>