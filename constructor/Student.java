/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.constructor;

/**
 *
 * @author syeda
 */
public class Student {
    String name ;
    int rollno;
    double marks;
    Student(String name,int rollno,double marks){
        this.rollno=rollno;
        this.marks=340;
        System.out.println(name+"\n"+rollno+"\n"+marks);
}
    Student(String name,int rollno){
        name="Man";
        this.rollno=44;
        System.out.println(name+"\n"+rollno);
    }
    public static void main(String[] args) {
        
        System.out.println("Student 1");
        Student s1=new Student("jack",80,99.5);
        
        System.out.println("\n"+"student 2");
        Student s2=new Student("jack",60);
        
    }
}