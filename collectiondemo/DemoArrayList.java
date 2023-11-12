/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author syeda
 */
public class DemoArrayList {
    public static void main(String[] args) {
       ArrayList a=new ArrayList();
       a.add(true);
       a.add(null);
       a.add("car");
       Iterator itra = a.iterator();
        while (itra.hasNext()) {
            Object next = itra.next();
            
            System.out.println(next);
        }
        System.out.println("size :"+a.size());
        System.out.println("==========================");




        //1
        ArrayList<Integer> a1=new  ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        int lastIn=a1.lastIndexOf(a1); //
        System.out.println("lastIndex :"+lastIn);
        
       int position = a1.indexOf(3);//
       System.out.println("postion of 3 :"+position);
        
        System.out.println("Arraylist1: ");
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            Object next = itr.next();
            
            System.out.println(next);
        }
        a1.remove(3);
        System.out.println("after remove arraylist1: "+a1); //
        



        //2
        System.out.println("---------------------------------------------");
        
        ArrayList<Integer> a2=(ArrayList<Integer>)a1.clone();
        
        System.out.println("is Empty : "+a2.isEmpty());//
        a2.clear();//
        System.out.println("Arraylist 2 : "+a2);//
        System.out.println("is Empty : "+a2.isEmpty());
        
        
        
        
        System.out.println("---------------------------------------------");
        //3
        ArrayList<String> as1=new ArrayList<>();
        as1.add("a");
        as1.add("b");
        as1.add("hyd");
        
        //4
        System.out.println("---------------------------------------------");
        ArrayList<String> as2=new ArrayList<>();
        as2.add("c");
        as2.addAll(as1);//
          System.out.println("Arraylist2: ");
           System.out.println("at index 3:"+ as2.get(3));
        
        System.out.println(as2);
        
    
        
        
        
    }
}
