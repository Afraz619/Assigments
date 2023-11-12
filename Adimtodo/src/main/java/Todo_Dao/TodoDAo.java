package Todo_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ToDo_Model.TodoModel;

public class TodoDAo {

	Connection con=MyConnection.myConnectionToDb();
	public boolean insert(TodoModel todo_bean) {
		 
		 try {
			 String query="Insert into todo values(null,?,?,?)";
			 PreparedStatement ps=con.prepareStatement(query);
			 ps.setString(1, todo_bean.getTodo());
			 ps.setString(2, todo_bean.getDate());
			 ps.setString(3, todo_bean.getTime());
			 int result=ps.executeUpdate();
			 
			 if(result==1) {
				 return true;
			 }
			 
		 }catch(SQLException ex) {
			 ex.printStackTrace();
		 }
		
		return false;
	}
	
	//display
	public List<TodoModel> getTodo(){
	
	List<TodoModel> todolist=new ArrayList<TodoModel>();
	String query="select * from todo";
	try {
       Statement st=con.createStatement();
       ResultSet rs= st.executeQuery(query);
       
       while(rs.next()){
    	   int no=rs.getInt(1);
    	   String todo=rs.getString(2);
    	   String date=rs.getString(3);
    	   String time=rs.getString(4);
    	   
    	   TodoModel todo_bean=new TodoModel(todo, date, time);
    	   todo_bean.setNo(no);
    	   
    	   todolist.add(todo_bean);
    	   
       }
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	return todolist;
	
	}

}
