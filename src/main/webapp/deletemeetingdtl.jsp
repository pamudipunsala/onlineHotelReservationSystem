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
	<h1 align="center">Cancel Meeting</h1>
	<%
		String id = request.getParameter("id");
		String code = request.getParameter("mpcode");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
	%>
	<div class="r2">
	<form action="delete" method="post">
		Meeting ID <br><input type="text" name="id" value="<%= id%>" readonly><br>
		Meeting Passcode <br><input type="text" name="pcode" value="<%= code%>" readonly><br>
		Date <br><input type="text" name="dt" value="<%= date%>" readonly><br>
		Time <br><input type="text" name="tm" value="<%= time%>" readonly><br>
		
		<input type="submit" id="btn1" name="submit" value="Delete Meeting Details">
	</form>
	</div>
</body>
</html>