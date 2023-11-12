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
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Average value 
        System.out.println("1. Average of Three Number");
        AvgValue obj1=new AvgValue();
        
        System.out.println("Enter the first number::");
        int firstValue= sc.nextInt();
        System.out.println("Enter the second number::");
        int secondValue = sc.nextInt();
        System.out.println("Enter the third number::");
        int thirdValue = sc.nextInt();
        int Avgans = obj1.AverageNumDynamically(firstValue, secondValue, thirdValue);
        System.out.println("answer:"+Avgans);
        
        
        //Division
        System.out.println("2. Division of two numbers");
        System.out.println("enter n1 value : ");
        int n1=sc.nextInt();
        System.out.println("enter n2 value : ");
        int n2=sc.nextInt();
        
        double Divans = Division.Div(n1,n2);
        System.out.println("answer:" +Divans);
        
        
        //EvenNumber
        System.out.println("3. EvenNumber");
        System.out.println("enter value : ");
        int n=sc.nextInt();
        EvenNumber.even(n);
        
        
        
        PrimeNumber num=new PrimeNumber();
        num.prime();
        StTest.prime();
        

        
        
        System.out.println("printing static"+StTest.b);
        StTest obj=new StTest();
        int ans =obj.a;
        System.out.println(ans);
    }
    
}
