<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%if(session.getAttribute("user")==null){
    	response.sendRedirect("login.jsp");
    	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1><a href="TodoServlet?action=logout"><button>logout</button></a></h1>
	<center>
<div>
<form action="TodoServlet?action=insert" method="post">
		
		<h1> Insert Your TODO Here </h1>
		
		ToDo <input type="text" name="todo"  requried="true"/><br><br>
		
		Date <input type="date" name ="date" requried="true"/> Time <input type="time" name="time" />
		
		<br><br>
		
		<input type="submit" value="insert" id="insert"/>
	</form>
	</div>
	<br>
	<div>
	<a href="TodoServlet?action=displayPage"><button>Display</button></a>
	</div>
	</center>
</body>

</html>