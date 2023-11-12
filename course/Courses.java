/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.course;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class Courses  {
    public void m1(){
        HashMap<Integer,String> hm=new HashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of enteries you want to insert : ");
        int size=sc.nextInt();
        
        for(int i=1;i<size+1;i++){
        System.out.println("\n"+i+". Enter  id:");
        int id=sc.nextInt();
        System.out.println(""+i+". Enter name:");
        String name=sc.next();
        hm.put(id, name);
            System.out.println("Inserted"+hm.entrySet());
        }
        
    }
}
