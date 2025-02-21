package com.tc.electronic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Technocom-21
 */
public class RCCar extends Toy implements OnOffDevice {
    @Override
    public void on (){
        System.out.println("Turn on RCCar!");
    }
    @Override
    public void off (){
        System.out.println("Turn off RCCar!");
    }
    
    public void RCCar(){
    }
    public void turnoff(){
    }
    public void brake(){
    }
    
}
