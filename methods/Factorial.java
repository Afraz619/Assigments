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
public class Factorial {
    int Fac(){
        int num = 4;
        int fact =1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        int ans = obj.Fac();
        System.out.println("answer : "+ans);
    }
}
