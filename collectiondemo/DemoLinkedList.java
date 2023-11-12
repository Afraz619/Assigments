/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author syeda
 */
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        list1.add(1);
        list1.add("aa");
        list1.add("bb");
        list1.add(2);
        list1.add(null);
        list1.add(true);
        
//        Iterator itr= list1.iterator();
//        while (itr.hasNext()) {
//            Object next = itr.next();
//            System.out.println(next);
//        }
        
        int n=list1.size();
        LinkedList list2=new LinkedList();
        for(int i=0;i<n;i++)
        {
            list2.add(list1.get(i));
        }
        
        
        
//        
//        System.out.println("test "+list1.get(2));
//        System.out.println("size: "+ list1.size());//
//        
//        System.out.println("----------------------------------");
//        System.out.println("linkedlist : "+list1);
//        
//        list1.addFirst(0);//
//        System.out.println("\n0 is added first:"+list1);
//        
//        list1.addLast(10);//
//        System.out.println("\n10 is added last:"+list1);
//        
//        
//         
//        System.out.println("----------------------------------");
//        list1.offerFirst("start");//
//        list1.offerLast("end");//
//        
//        System.out.println("using offermethod: "+list1);
//       
//        list1.add(5, "middleElement");
//        System.out.println("\nafter adding element :"+list1);
//        
//        list1.set(7, false);
//        System.out.println("\nafter replace null :"+list1);
//        
//        System.out.println("\ncontain null :"+list1.contains(null));
//                
    }
}
