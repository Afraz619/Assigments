/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syeda
 */
public class ExampleInsert {
    public static void main(String[] args) {
        Connection con = ExampleConnection.connectTO();
        ExampleInput in=new ExampleInput();
        ExampleShowTable.showTable();
        String query="Insert into example (Name,address,salary)values(?,?,?)";
        try {
            //input
           in.userInput();
            PreparedStatement ps=con.prepareStatement(query);
          String name=in.name;
          String address=in.addr;
          String sal=in.sal;
//                ps.setString(1,name);
//                ps.setString(2,address);
//                ps.setString(3, sal);
                
                 ps.setString(1,in.name.toString());
                ps.setString(2,in.addr.toString());
                ps.setString(3, in.sal.toString());
                int count=ps.executeUpdate();
                if(count>0){
                    System.out.println("Done...");
                }
                else{
                    System.out.println("Failed Try again....");
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
