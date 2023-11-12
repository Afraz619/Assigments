/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbcAssg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syeda
 */
public class ExampleInput {
    String name;
    String addr;
    String sal;
    public void userInput(){
        Scanner sc =new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter name:");
        try {
            name=br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Enter Address");
        addr=sc.next();
        
        System.out.println("Enter Salary");
        sal=sc.next();
        
    }
}
