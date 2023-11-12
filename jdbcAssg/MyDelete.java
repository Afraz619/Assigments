/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author syeda
 */
public class MyDelete {
    public static void main(String[] args) {
        String sqlQuery="delete from students where studentId=12";
        Connection con=MyConnection2.connectToDb();
        try {
             Statement stm=con.createStatement();
            int result= stm.executeUpdate(sqlQuery);
            System.out.println(result);
        } catch (Exception e) {
        }
       
        
    }
}
