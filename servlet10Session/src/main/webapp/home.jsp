<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)session.getAttribute("name_key");
	%>
	<h3 style="color: blue;">Welcome <%= name %></h3>
	
	<a href="profile.jsp" > Profile </a><br>
	<a href="about_us.jsp" > About Us </a>
</body>
</html>