package com.afraz.todo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import ToDo_Model.UserModel;
import Todo_Dao.UserDao;

/**
 * Servlet implementation class registration
 */
@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("name");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String contact=request.getParameter("contact");
		String next=null;
		UserDao user_dao=new UserDao();
		UserModel user_bean=new UserModel(uname, email, pass, contact);
		boolean status=user_dao.register(user_bean);
			if(status) {
				response.sendRedirect("login.jsp");
				request.setAttribute("status", "success");
			}else{
				request.setAttribute("status", "failed");
			}
			RequestDispatcher rd=request.getRequestDispatcher(next);
			rd.forward(request, response);
			
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
