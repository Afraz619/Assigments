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
public class JavaScript extends Degree{
    private int jsPrice=700;
    private int jsNotes=200;
    private int jsVideos=500;

    public JavaScript(boolean online) {
        super(online);
    }
    public void getCprice(){
        System.out.println(" course fee is  :"+jsPrice);
        this.price += jsPrice;
        System.out.println("Total $:"+this.price);
    }
        
    public void getCNotes(){
        this.price += jsNotes;
    }
    public void getCVideos(){
        this.price += jsVideos;
    }
}
