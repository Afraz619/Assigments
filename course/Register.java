/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.course;

import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class Register {
    private String user;
    private int number;
    
    public void validUserNumber(int number){
      if(this.number>0);
      else{
              System.out.println("Enter a valid number");
          }
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Register rs=new Register();
//        System.out.println("Enter your name and phone number");
//        System.out.println("Enter name : ");
//        String name=sc.nextLine();
//        rs.setUser(name);
//        System.out.println("Enter your phone number");
//        int number=sc.nextInt();
//        rs.setNumber(number);
//        rs.validUserNumber(number);
//        System.out.println("name: "+rs.getUser()+"\nphno:"+rs.getNumber());
//    }
}
