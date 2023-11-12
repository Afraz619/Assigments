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
public class SelectOne {
    public static void main(String[] args) {
        Connection con=ConnectMySql.connectTODb();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id :");
        int idval=sc.nextInt();
        String query="select *from emp where empId="+idval;
        try {
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int address=rs.getInt(3);
                System.out.println(id+" "+name+"  "+address);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
