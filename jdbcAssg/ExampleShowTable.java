/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author syeda
 */
public class ExampleShowTable {
    public static void showTable(){
        Connection con = ExampleConnection.connectTO();
        try {
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select *from example");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
