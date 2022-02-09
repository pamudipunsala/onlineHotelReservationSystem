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
	<h1 align="center">Delete Account</h1>
	<%
		String mid = request.getParameter("id");
		String mname = request.getParameter("name");
		String mpnum = request.getParameter("phone");
		String maddress = request.getParameter("address");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
	%>
	<div class="r2">
	<form action="deleteDtl" method="post">
		ID <br><input type="text" name="mid" value="<%= mid%>" readonly><br>
		Name <br><input type="text" name="mname" value="<%= mname%>" readonly><br>
		Phone No <br><input type="text" name="pnum" value="<%= mpnum%>" readonly><br>
		Address <br><input type="text" name="add" value="<%= maddress%>" readonly><br>
		User Name <br><input type="text" name="uname" value="<%= userName%>" readonly><br>
		
		<input type="submit" id="btn1" name="submit" value="Delete Account">
	</form>
	</div>
</body>
</html>