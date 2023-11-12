package Todo_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Login_Dao {
	 
	 Connection con=MyConnection.myConnectionToDb();
	 String query;
     PreparedStatement pst;
     ResultSet rs;

	
	
	public boolean userLogin(String email, String password) {
        try {
  
            query = "select * from user where email=? and password=?";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if(rs.next()){
            	return true;
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return false;
    }

}
