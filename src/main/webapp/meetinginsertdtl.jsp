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
	<h1 align="center">Arrange new Meeting</h1>
	<div class="r2">
	<form action="arrange" method="post"> 
		Meeting Id <input type="text" name="mtid"><br>
		Meeting Passcode <input type="text" name="mpcode"><br>
		Date <input type="text" name="dt"><br>
		Time <input type="text" name="tm"><br>
		
		<input type="submit" name="submit" id="btn1" value="Arrange new meeting">
	</form>
	</div>
</body>
</html>