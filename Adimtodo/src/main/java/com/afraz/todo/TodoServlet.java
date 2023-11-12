package com.afraz.todo;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ToDo_Model.TodoModel;
import Todo_Dao.TodoDAo;

/**
 * Servlet implementation class TodoServlet
 */
@WebServlet("/TodoServlet")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TodoServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String action =request.getParameter("action");
		TodoDAo todo_dao=new TodoDAo(); 
		String next=null;
		
		if(action.equalsIgnoreCase("insert")) {
			String todo=request.getParameter("todo");
			String date=request.getParameter("date");
			String time =request.getParameter("time");
			
			TodoModel todo_bean=new TodoModel(todo, date, time);
			boolean status=todo_dao.insert(todo_bean);
			
			if(status) {
				out.print("Inserted Successfully");
				//next="succes.jsp";
			}
			else {
				out.print("Failed to insert.....Tryagain");
				//next="error.jsp";
			}
		}
		
		//logout
		else
			if(action.equalsIgnoreCase("logout")) {
				if(request.getSession().getAttribute("user")!=null) {
					request.getSession().removeAttribute("user");
					next="login.jsp";
					//response.sendRedirect("login.jsp");
				}else {
					next="todo.jsp";
					//response.sendRedirect("todo.jsp");
				}
			}
		
		
		//display
			else
				if(action.equalsIgnoreCase("displayPage")) {
			            List<TodoModel> todolist=todo_dao.getTodo();
			            
			            request.setAttribute("list",todolist);
			            next="displayPage.jsp";
			        }
			    
			RequestDispatcher rd=request.getRequestDispatcher(next);
			rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
