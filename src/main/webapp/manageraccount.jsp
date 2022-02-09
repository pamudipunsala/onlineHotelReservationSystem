<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<table border='1'>
	<c:forEach var="mgr" items="${mDtl}">
	
	<c:set var="id" value="${mgr.mid}"/>
	<c:set var="name" value="${mgr.mName}"/>
	<c:set var="pnum" value="${mgr.mpnumber}"/>
	<c:set var="address" value="${mgr.maddress}"/>
	<c:set var="uname" value="${mgr.userName}"/>
	<c:set var="pwd" value="${mgr.password}"/>
	
	<tr>
		<td>Manager ID</td>
		<td>${mgr.mid}</td>
	</tr>
	<tr>
		<td>Manager Name</td>
		<td>${mgr.mName}</td>
	</tr>
	<tr>
		<td>Manager Phone No</td>
		<td>${mgr.mpnumber}</td>
	</tr>
	<tr>
		<td>Manager Address</td>
		<td>${mgr.maddress}</td>
	</tr>
	<tr>
		<td>Manager UserName</td>
		<td>${mgr.userName}</td>
	</tr>
	<tr>
		<td>Manager Password</td>
		<td>${mgr.password}</td>
	</tr>	
	</c:forEach>
	</table>
	
	<c:url value="updatemanger.jsp" var="mgrupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="phone" value="${pnum}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="pwd" value="${pwd}"/>
	</c:url>
	<br>
	<a href="${mgrupdate}">
		<input type="button" name="update" id="btn1" value="Update Details">
	</a><br>
	
	<c:url value="deletemanager.jsp" var="mgrdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="phone" value="${pnum}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="pwd" value="${pwd}"/>
	</c:url>
	<a href="${mgrdelete}">
	<input type="button" name="delete" id="btn1" value="Delete account">	
	</a>
	<br>
	<a href="meeting.jsp">
	<input type="button" name="arrange" id="btn1" value="Meetings Details">
	</a>
	</div>
</body>
</html>