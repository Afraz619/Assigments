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
<form action="login" method="post" >
             <h1> <div>Login</div></h1>
        <table style="with: 80%">
                
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="email" required="true"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" required="true"/></td>
                </tr>
               
            </table><br>
            <input type="submit" value="submit" id="insert" />
    
        </form><br>
        
           <a href="registration.jsp"  ">register</a> 
</body>
</center>
</html>