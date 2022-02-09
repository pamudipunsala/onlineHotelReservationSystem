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
	<h1 align="center">View Existing Meeting Details</h1>
	<div class="r2">
	<form action="view" method="post">
		Meeting ID <br><input type="text" name="mtid" placeholder="Enter meeting id"><br>
		Meeting Passcode <br><input type="text" name="pcd" placeholder="Enter meeting passcode"><br>
		
		<input type="submit" name="submit" id="btn1" value="View Meeting Details">
	</form>
	</div>
</body>
</html>