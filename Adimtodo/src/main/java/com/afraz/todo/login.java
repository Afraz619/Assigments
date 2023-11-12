package com.afraz.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Todo_Dao.Login_Dao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String useremail=request.getParameter("email");
		String userpass=request.getParameter("pass");
		//String next = null;
		
		Login_Dao lg=new Login_Dao();
		boolean result=lg.userLogin(useremail, userpass);
		
		if(result) {
			request.getSession().setAttribute("user", result);
			response.sendRedirect("todo.jsp");
		}
		else {
			out.println("there is no user");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
