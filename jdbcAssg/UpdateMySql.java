/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author syeda
 */
public class UpdateMySql {
    public static void main(String[] args) {
        Connection con=MyConnection2.connectToDb();
        String query="update students set studentName='khan',studentAddress='kkl' where studentId=10";
        try {
            Statement stm=con.createStatement();
            int result=stm.executeUpdate(query);
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
