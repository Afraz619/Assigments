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
public class StTest {
    int a=4;
    static int b=4;
    
  static  void prime(){
      System.out.println("from Static");
        int num = 10;
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
               count++;
            }
        }
        if(count > 1){
            System.out.println(num +" is not a prime ");
        }
        else
        {
            System.out.println(num +" is a prime number");
        }
            
    }
    
}
