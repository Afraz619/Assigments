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
public class CandCPP extends Degree {
    private int cNotes = 500;
    private int cPrice= 1000;
    private int cVideos= 600;

    public CandCPP(boolean online) {
        super(online);
    }
    public void getCprice(){
        System.out.println(" course fee is  :"+cPrice);
        this.price += cPrice;
        System.out.println("Total $:"+this.price);
    }
        
    public void getCNotes(){
        this.price += cNotes;
    }
    public void getCVideos(){
        this.price += cVideos;
    }
}
