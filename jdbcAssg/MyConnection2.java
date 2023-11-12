/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author syeda
 */
public class MyConnection2 {
    private static String url = "jdbc:mysql://localhost:3306/college_db";    
    private static String driverName = "com.mysql.cj.jdbc.Driver";   
    private static String userName = "root";   
    private static String password = "welcome";
    private static Connection con;
   

    public static Connection connectToDb() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, userName, password);
                System.out.println("connected to database");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
