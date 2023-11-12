<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%@page import="com.afraz.bean.UserModel" %> --%>
   <%--  <%@page import="com.afraz.bean.UserDao" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userobj" class="com.afraz.bean.UserModel"></jsp:useBean>
<%-- <jsp:setProperty property="*" name="userobj"/> --%>
<jsp:setProperty property="name" name="userobj"/>
<jsp:setProperty property="email" name="userobj"/>
<jsp:setProperty property="password" name="userobj"/>
<jsp:setProperty property="contact" name="userobj"/>
<jsp:useBean id="dao_Obj" class="com.afraz.bean.UserDao"></jsp:useBean>

<% 
	int status=dao_Obj.register(userobj);
	if(status>0){
		out.print("success");
	
%>
Records are:<br>
<jsp:getProperty property="name" name="userobj"/><br>
<jsp:getProperty property="email" name="userobj"/><br>
<jsp:getProperty property="password" name="userobj"/><br>
<jsp:getProperty property="contact" name="userobj"/> <br>

<%} %>






</body>
</html>