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
			Cookie c1=new Cookie("111","222");
			Cookie c2=new Cookie("mmm","nnn");
			response.addCookie(c1);
			response.addCookie(c2);
			response.sendRedirect("showcookie.jsp");
		
		%>
</body>
</html>