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
	<table border="1" style="width:100%">
	<c:forEach var="mtd" items="${meetingdtl}">
	
	<c:set var="id" value="${mtd.mtid}"/>
	<c:set var="code" value="${mtd.pcode}"/>
	<c:set var="dt" value="${mtd.dt}"/>
	<c:set var="tm" value="${mtd.tm}"/>
	
	<tr>
		<td>Meeting ID</td>
		<td>${mtd.mtid}</td>
	</tr>
	<tr>
		<td>Meeting Passcode</td>
		<td>${mtd.pcode}</td>
	</tr>
	<tr>
		<td>Date</td>
		<td>${mtd.dt}</td>
	</tr>
	<tr>
		<td>Time</td>
		<td>${mtd.tm}</td>
	</tr>	
	</c:forEach>
	</table>
	
	<c:url value="updatemeeting.jsp" var="updatedtl">
		<c:param name="id" value="${id}"/>
		<c:param name="mpcode" value="${code}"/>
		<c:param name="date" value="${dt}"/>
		<c:param name="time" value="${tm}"/>
	</c:url>
	
	<br>
	<a href="${updatedtl}">
	<input type="button" name="update" id="btn1" value="Update Details">
	</a>
	
	<c:url value="deletemeetingdtl.jsp" var="deletedtl">
		<c:param name="id" value="${id}"/>
		<c:param name="mpcode" value="${code}"/>
		<c:param name="date" value="${dt}"/>
		<c:param name="time" value="${tm}"/>
	</c:url>
	
	<br>
	<a href="${deletedtl}">
	<input type="button" name="delete" id="btn1" value="Delete Details">
	</a>
	</div>
</body>
</html>