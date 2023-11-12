/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.methods;

import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class SwitchCase {
    
    int addition(int n1,int n2){
        int add=n1+n2;
        return add;
    }
    int subtraction(int n1,int n2){
        int sub=n1-n2;
        return sub;
    }
    double division(int n1,int n2){
        double div=n1/n2;
        return div;
    }
    int multiplication(int n1,int n2){
        int mul=n1*n2;
        return mul;
    }
    int module(int n1,int n2){
        int mod=n1/n2;
        return mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwitchCase obj=new SwitchCase();
        int ans;
        System.out.println("select the option");
        System.out.println("1:add" +"\n" +"2:sub"+ "\n" + "3:div "+"\n"+"Enter option:");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("n1 value :");
                int n1=sc.nextInt();
                System.out.println("n2 value :");
                int n2=sc.nextInt();
                ans = obj.addition(n1, n2);
                System.out.println("answer: "+ans);
                break;
            
            case 2:
                System.out.println("n1 value :");
                n1=sc.nextInt();
                System.out.println("n2 value :");
                n2=sc.nextInt();
                ans = obj.subtraction(n1, n2);
                System.out.println("answer: "+ans);
                break;
            case 3:
                System.out.println("n1 value :");
                n1=sc.nextInt();
                System.out.println("n2 value :");
                n2=sc.nextInt();
                double divans = obj.division(n1, n2);
                System.out.println("answer :"+divans);
                break;    
                
        }
    }
}
