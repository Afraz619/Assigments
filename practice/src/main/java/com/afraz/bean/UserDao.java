package com.afraz.bean;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserDao {
	Connection con;
	public UserDao() {
		con=MyConnection.myConnectionToDb();
	}
	
	public int register(UserModel userbean) {
		String query="insert into user values(null,?,?,?,?)";
		int result=0;
		try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,userbean.getName());
		ps.setString(2,userbean.getEmail());
		ps.setString(3,userbean.getPassword());
		ps.setString(4,userbean.getContact());
		result =ps.executeUpdate();
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
