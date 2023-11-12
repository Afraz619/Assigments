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
public class SumOfNumber {
    int Sumofvalue(){
        int num = 1563;
        int sum=0;
        while(num>0){
            int c=num%10;
            num =num/10;
            sum = sum+c;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfNumber obj = new SumOfNumber();
        int ans = obj.Sumofvalue();
        System.out.println("sum of 1567 is :"+ ans);
    }
}
