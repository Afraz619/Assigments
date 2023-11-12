/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcemployee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class InsertEmployee {
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        Connection con=ConnectMySql.connectTODb();
        
        System.out.println("Employee Table:");
        
        //show table
        ShowEmployeTable.showTable();
        
        //Max Salary
        System.out.println("Maximum Salary:");
        ShowMaxSal.maxSalary();
        

        //insert into table
        System.out.println("\nEnter id:");
        int id=sc.nextInt();
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter salary:");
        int salary=sc.nextInt();
        String query="Insert into emp values('"+id+"','"+name+"','"+salary+"')";
        
        try {
            Statement stm=con.createStatement();
            int result =stm.executeUpdate(query);
            System.out.println(result);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        

        //show table
        System.out.println("\n After Insertion");
        ShowEmployeTable.showTable();
        
       

    }
}
