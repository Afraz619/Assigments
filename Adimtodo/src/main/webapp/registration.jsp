<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<center>
<body>
   <form action="registration" method="post" >
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
                    <td><input type="password" name="pass" required="true"/></td>
                </tr>
                <tr>
                    <td>Contact No</td>
                    <td><input type="text" name="contact" required="true"/></td>
                </tr>
            </table><br>
            <input type="submit" value="insert" id="insert" />
        </form><br>
         <a href="login.jsp" >I am already a member</a> 
</body>
</center>
</html>