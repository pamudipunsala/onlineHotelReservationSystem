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
	<h1 align="center">Update Manager Details</h1>
	
	<%
		String mid = request.getParameter("id");
		String mname = request.getParameter("name");
		String mpnum = request.getParameter("phone");
		String maddress = request.getParameter("address");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
	%>
	<div class="r2">
	<form action="updateDtl" method="post">
		ID <input type="text" name="mid" value="<%= mid%>" readonly><br>
		Name <input type="text" name="mname" value="<%= mname%>"><br>
		Phone No <input type="text" name="pnum" value="<%= mpnum%>"><br>
		Address <input type="text" name="add" value="<%= maddress%>"><br>
		User Name <input type="text" name="uname" value="<%= userName%>"><br>
		Password <input type="password" name="pwd" value="<%= password%>"><br>
		
		<input type="submit" name="submit" id="btn1" value="Update">
	</form>
	</div>
</body>
</html>