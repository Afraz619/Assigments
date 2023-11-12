<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="ToDo_Model.TodoModel" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Details</h1>
	<%List<TodoModel> todolist=(List<TodoModel>)request.getAttribute("list"); %>
	<table Border="1">
	<thead>
		<tr>
			<th>Todo</th>
			<th>Date</th>
			<th>Time</th>

		</tr>
	</thead>
	<tbody>
                <%
                for(TodoModel todo:todolist){
                %>
                <tr>
                	
                    <td><%=todo.getTodo() %></td>
                    <td><%=todo.getDate() %></td>
                    <td><%=todo.getTime() %></td>
                  
                  <%--   <td><a href="EmployeeServlet?action=delete&id=<%=emp.getEmp_id() %>"><img src="image/images.jpg"/></a></td>

                    <td><a href="EmployeeServlet?action=editData&id=<%=emp.getEmp_id() %>">Edit</a></td> --%>
                </tr>
                <%} %>
    </tbody>
    </table>
</center>
</body>
</html>