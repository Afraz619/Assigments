<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <form action="Demo.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
<%
String name2=(String)session.getAttribute("user");
out.println("hello"+name2);
%> --%>

<center>
<body>
   <form action="userbean.jsp" method="post" >
             <h1> <div>Insert the Details</div></h1>
        <table style="with: 80%">
                <tr>
                    <td> Name</td>
                    <td><input type="text" name="name" required="true" /></td>
                </tr>
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="email" required="true"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" required="true"/></td>
                </tr>
                <tr>
                    <td>Contact No</td>
                    <td><input type="text" name="contact" required="true"/></td>
                </tr>
            </table><br>
            <input type="submit" value="insert" id="insert" />
        </form><br>
         <a href="Demo.jsp" >secondjsp</a> 
</body>
</center>

</body>
</html>
 