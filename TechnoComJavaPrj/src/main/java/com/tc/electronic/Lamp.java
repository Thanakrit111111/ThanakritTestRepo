package com.tc.electronic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Technocom-21
 */
public class Lamp extends Appliance implements OnOffDevice{
    @Override
    public void on (){
        System.out.println("Turn on Lamp!");
    }
    @Override
    public void off (){
        System.out.println("Turn on Lamp!");
    }
     public void dim(){
    }
}
