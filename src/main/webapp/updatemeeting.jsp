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
	
	<%
		String id = request.getParameter("id");
		String code = request.getParameter("mpcode");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
	%>
	<div class="r2">
	<form action="update" method="post">
		Meeting ID <input type="text" name="mtid" value="<%= id%>" readonly><br>
		Meeting Passcode <input type="text" name="mpcode" value="<%= code%>"><br>
		Date <input type="text" name="dt" value="<%= date%>"><br>
		Time <input type="text" name="tm" value="<%= time%>"><br>
		
		<input type="submit" id="btn1" name="submit" value="Update">
	</form>
	</div>
</body>
</html>