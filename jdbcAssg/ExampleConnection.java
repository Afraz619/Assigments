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
public class ExampleConnection {

    private static String url = "jdbc:mysql://localhost:3306/college_db";
    private static String userName = "root";
    private static String userPassword = "welcome";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static Connection con;

    public static Connection connectTO() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, userName, userPassword);
                System.out.println("Connected to data base");
            } catch (SQLException se) {
                System.out.println("Didn't Connected to DataBase");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return con;
    }

}
