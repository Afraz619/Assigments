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
public class SwapTwoValues {
    
    
    void Swap(){
        int a= 10;
        int b= 12;
        int temp ;
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = "+a);
        System.out.println("b = " +b);
    }
    public static void main(String[] args) {
        SwapTwoValues obj=new SwapTwoValues();
        obj.Swap();
    }
}
