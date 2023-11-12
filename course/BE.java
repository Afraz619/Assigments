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
public class BE extends Degree {
    public int BEprice;
    public int notesPrice=100;
    public int recordedVideos = 500;

    public BE(boolean online) {
        super(online);
    }
    public int getNotes(){
        System.out.println("Notes Addded");
        this.price += notesPrice;
        return price;
    }
    
    public int getRecordedVideos(){
        System.out.println("Recorded videos added");
        this.price += recordedVideos;
        return price;
    }
    
    public int getPrice(){
        System.out.println(this.price);
        return price;
    }
    
    
}
