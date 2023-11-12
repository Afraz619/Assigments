package Todo_Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection myConnectionToDb() {
		String user="root";
		String password="welcome";
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/college_db";
		Connection con=null;
	try {
		Class.forName(driverName);
		con=DriverManager.getConnection(url, user, password);
		System.out.println("connected");
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	return con;
	}
	
	
}
