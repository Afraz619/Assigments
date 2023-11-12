/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syeda
 */
public class PreparedExampleDelete {
    public static void main(String[] args) {
    
    ExampleShowTable.showTable();
        
    Scanner sc=new Scanner(System.in);
    String url="jdbc:mysql://localhost:3306/college_db";
    String driverName="com.mysql.cj.jdbc.Driver";
//    
    String userName="root";
    String userPassword="welcome";
    
        try {
            Class.forName(driverName);
//            System.out.println("Enetr UserName:");
//            String userName=sc.next();
//            System.out.println("Enter Password:");
//            String userPassword=sc.next();
         
             Connection con=DriverManager.getConnection(url, userName, userPassword);
//             System.out.println("Eneter userId to delete: ");
//             int userID=sc.nextInt();
             String query="delete from example where ID=?";
             PreparedStatement ps=con.prepareStatement(query);
             ps.setInt(1, 1);
             ps.executeUpdate();
       }
       catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }
}
