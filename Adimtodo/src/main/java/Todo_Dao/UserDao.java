package Todo_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ToDo_Model.UserModel;

public class UserDao {
	Connection con;
	public UserDao() {
		con=MyConnection.myConnectionToDb();
	}
	
	public boolean register(UserModel userbean) {
		String query="insert into user values(null,?,?,?,?)";
		try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,userbean.getName());
		ps.setString(2,userbean.getEmail());
		ps.setString(3,userbean.getPassword());
		ps.setString(4,userbean.getContact());
		int result =ps.executeUpdate();
		if(result==1) {
			return true;
		}
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
