<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<%
		String name = (String)session.getAttribute("name_key");
	%>
	<h3 style="color: blue;">Welcome <%= name %></h3>
	
	<a href="home.jsp" > Home </a><br>
	<a href="about_us.jsp" > About Us </a><br>
	<a href="logout"> Logout </a>
</body>
</html>