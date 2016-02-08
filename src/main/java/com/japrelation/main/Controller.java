/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.japrelation.main;

import com.japrelation.entity.Artist;
import com.japrelation.entity.Cd;
import com.japrelation.entity.SampleOrder;
import java.util.List;

/**
 *
 * @author matsumoto
 */
public class Controller {
    public static void main(String[] args){
        SampleFacade sf = new SampleFacade();
        List<SampleOrder> sampleOrder = sf.getAll();
        
        System.out.println("aaaa");
        
        //多対多
        List<Cd> cdList = sf.getCdList();
        //多対多        
        List<Artist> artistList = sf.getArtistList();
 
        System.out.println("bbbb");
    }
}
