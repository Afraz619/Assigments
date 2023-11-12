<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="Demo2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name= request.getParameter("uname");
out.print(request.getParameter("uname"));
//response.sendRedirect("http://www.google.com");
session.setAttribute("user", name);
%>
<a href="index.jsp">second page</a>


</body>
</html>