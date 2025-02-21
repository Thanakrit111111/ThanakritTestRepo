/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tc.electronic;

/**
 *
 * @author Technocom-21
 */
public class DVDPlayer extends MediaPlayer implements OnOffDevice {
    
    @Override
    public void on (){
        System.out.println("Turn on DVDPlayer!");
    }
    @Override
    public void off (){
        System.out.println("Turn off DVDPlayer!");
    }
    
   
    public void play(){
    }
    public void pause(){
    }
    public void skip(){
    }
    
}
