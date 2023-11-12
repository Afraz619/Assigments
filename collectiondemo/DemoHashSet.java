/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.collectiondemo;

import java.util.HashSet;

/**
 *
 * @author syeda
 */
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet h1=new HashSet();
        h1.add("hello");
        h1.add("welcome");
        h1.add(1);
        h1.add(2);
        h1.add(null);
        
        System.out.println("size : "+h1.size());//
        System.out.println(h1);
                
        
        h1.remove(2);
        
        System.out.println("\nafter remove methode :"+h1);
        
        System.out.println("\nempty ? :"+h1.isEmpty());
        
        HashSet<Double> h2=new HashSet<>();//
        h2.add(23.23);
        h2.add(43.44);
        System.out.println("\nHashset 2:"+h2);
        
        
        HashSet<String> h3=new HashSet<>();
        h3.add("HYD");
        h3.add("Hyd");
        h3.add("hyd");
        
        System.out.println("\nHashSet 3: "+h3);
        
        h3.add("HYD");
        h3.add("Del");
        System.out.println("\nTest : "+h3);
        
        h3.remove("Hyd");
        System.out.println("\nremove :"+h3);
    }
}
