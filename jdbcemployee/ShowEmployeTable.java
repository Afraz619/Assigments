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

/**
 *
 * @author syeda
 */
public class ShowEmployeTable {
    public static void showTable(){
        Connection con =ConnectMySql.connectTODb();
        try {
             Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ".  " + rs.getString(2) + "   " + rs.getInt(3));

            }
        } catch (SQLException e) {
        }
    }
}
