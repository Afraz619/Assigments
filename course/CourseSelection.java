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
public class CourseSelection {
    public static void selection(int courseListAnswer){
        switch(courseListAnswer){
                            case 1:
                                JavaCourse jv=new JavaCourse(true);
                                jv.getJavaprice();
                                break;
                            case 2:
                                CandCPP c=new CandCPP(true);
                                c.getCprice();
                                break;
                            case 3:
                                JavaScript js=new JavaScript(true);
                                js.getCprice();
                                break;
                        }
    }
}
