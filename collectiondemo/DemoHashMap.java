/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.collectiondemo;

import java.util.HashMap;
import java.util.Scanner;
import com.afraz.course.Courses;

/**
 *
 * @author syeda
 */
public class DemoHashMap {
    public static void main(String[] args) {
//        HashMap<Integer,String> hm=new HashMap();
        Scanner sc =new Scanner(System.in);
        
//        System.out.println("Enter number of enteries you want to insert : ");
//        int size=sc.nextInt();
//        
//        for(int i=1;i<size;i++){
//        System.out.println("\n"+i+". Enter  id:");
//        int id=sc.nextInt();
//        System.out.println("\n"+i+". Enter name:");
//        String name=sc.next();
//        hm.put(id, name);
//        }
        Courses cs=new Courses();
        cs.m1();
        System.out.println("IF you want to add more entry Enter Yes (or) Type Exit");
        String answer=sc.next();
        if(answer.equalsIgnoreCase("yes")==true){
            cs.m1();
        }
        else{
            System.out.println("Completed Thankyou");
//            System.out.println("\nlist :"+hm);
        }
//        System.out.println("\nlist :"+hm);
        
    }
}
