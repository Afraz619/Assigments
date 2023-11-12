/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.course;

/**
 *
 * @author syeda
 */
public class JavaCourse extends Degree{
    private int javaCoursePrice =1500;
    private int javanotes = 500;
    private int javaRecordedVideos=700;

    public JavaCourse(boolean online) {
        super(online);
    }
    
    public void getJavaprice(){
        System.out.println("java course fee is  :"+javaCoursePrice);
        this.price += javaCoursePrice;
        System.out.println("Total $:"+this.price);
    }
        
    public void getJavaNotes(){
        this.price += javanotes;
    }
    public void getJavaVideos(){
        this.price += javaRecordedVideos;
    }
    
    
    
}
