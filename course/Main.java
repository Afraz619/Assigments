/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.course;

import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class Main  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Register rs=new Register();
        System.out.println("Enter your name and phone number");
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        rs.setUser(name);
        System.out.println("Enter your phone number");
        int number=sc.nextInt();
        rs.setNumber(number);
        rs.validUserNumber(number);
//        System.out.println("name: "+rs.getUser()+"\nphno:"+rs.getNumber());
        
      
        System.out.println(" Welcome to Career.com\n ");
        System.out.println("* Here are the Degree option for you ");
        System.out.println("1.BE"+"\n"+"2.Btech\n");
        System.out.println("* Insert the Degree option number you want to select:");
        
        int degreeOption=sc.nextInt();
        switch(degreeOption){
            case 1:
                System.out.println("* You have Selected option "+degreeOption);
                System.out.println("\n* If you want online classes Enter Yes(or)No ");
                String request=sc.next();
                
                if(request.equalsIgnoreCase("yes")==true){
                    System.out.println("* You have requsted for online classes"+"\n");
                    BE obj=new BE(true);
                    System.out.println("That will cost you= $"+obj.getPrice());
                    System.out.println("\nIf you want additional courses with degree type Yes(or)No");
                    String answer=sc.next();
                    
                    if(request.equalsIgnoreCase("yes")==true){
                        System.out.println("\nList of Courses \n1.Java\n2.C\n3.C++\n4.JavaScript");
                        System.out.println("\nType the option number you want to select :");
                        int courseListAnswer=sc.nextInt();
                        CourseSelection.selection(courseListAnswer);
                    }
                    else{
                        System.out.println("your total price is: $"+obj.getPrice());
                    }

                }else{
                    BE obj=new BE(false);
                    System.out.println("* You have requted for offline classes\nThat will cost you=");
                    obj.getPrice();
                    System.out.println("\n*If you want additional courses with degree type Yes(or)No");
                    String answer=sc.next();
   
                    if(request.equalsIgnoreCase("yes")==true){
                        System.out.println("\nList of Courses \n1.Java\n2.C\n3.C++\n4.JavaScript");
                        System.out.println("\n*Type the option number you want to select :");
                        int courseListAnswer=sc.nextInt();
                        CourseSelection.selection(courseListAnswer);
                    }
                }
                break;
            
            
            
            case 2:
                System.out.println("* You have Selected option "+degreeOption);
                System.out.println("* If you want online classes Enter Yes");
                String request2=sc.nextLine();
                if(request2.equalsIgnoreCase("yes")==true){
                    System.out.println("* You have requted for online classes"+"\n"+"That will cost you=");
                    Btech obj2=new Btech(true);
                    obj2.getPrice();
                }else{
                    Btech obj2=new Btech(false);
                    System.out.println("* You have requted for offline classes\nThat will cost you=");
                    obj2.getPrice();
                }
                break;
        }
                
        
        
       

//        JavaCourse jc=new JavaCourse(true);
//        
////        obj.getNotes();
////        obj.getRecordedVideos();
////        obj.getPrice();
//        jc.getNotes();
//        jc.getRecordedVideos();
//        jc.getJavaprice();        

        
    }
}
