/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.exception;

import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class Check {
    public int addPositive(int a,int b){
        try{
        if(a>0&&b>0){
            int ans = a+b;
             return ans;
        }
        else throw new CustomException("envalid number");
             
        }catch(CustomException e){
            e.printStackTrace();
             System.out.println("Enter a positive number");
        }
        finally{
            System.out.println("hello");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Check obj=new Check();
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        int ans=obj.addPositive(a, b);
        System.out.println(ans);
        
        
    }
}
