/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.metadata;
import com.afraz.jdbcAssg.MyConnection2;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class ImageInsertDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String query1 ="select *from empimagedemo";
        String query2="insert into empimagedemo values(?,?,?)";
        Connection con=MyConnection2.connectToDb();
        PreparedStatement ps;
        
        try {
            ps=con.prepareStatement(query1);
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            
            System.out.println("Table Name: "+rsmd.getTableName(1));
            System.out.println("Number of col: "+rsmd.getColumnCount());
            System.out.println("1."+rsmd.getColumnName(1)+"  2."+rsmd.getColumnName(2)+"  3."+rsmd.getColumnName(3));
            System.out.println("Type of Col: \n1."+rsmd.getColumnTypeName(1)+"  2."+rsmd.getColumnTypeName(2)+"  3."+rsmd.getColumnTypeName(3));
            System.out.println("continue..\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        //insert Image 
        
        try {
          
            ps=con.prepareStatement(query2);
            
            System.out.println("Enter image address: ");
            String img=sc.next();
            
            
            ps.setInt(1, 6);
            ps.setString(2, "laddu");
            
            FileInputStream fis=new FileInputStream(img);
            
            ps.setBinaryStream(3, fis,fis.available());
            int count = ps.executeUpdate();
            
            System.out.println("completed");
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
