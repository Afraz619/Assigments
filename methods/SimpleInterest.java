/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.methods;

/**
 *
 * @author syeda
 */
public class SimpleInterest {
    // formula I=P(1+rt)
    double Simple(){
    int p=3400;         // principle
    double r=0.095;     // rate = 9.5%
    int t=6;            // time
    double I = (p*r*t)/100;
    return I;
    }
    public static void main(String[] args) {
        SimpleInterest obj=new SimpleInterest();
        double ans = obj.Simple();
        System.out.println("answer:"+ans);
    }
    
}
