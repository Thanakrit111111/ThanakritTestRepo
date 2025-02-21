/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tc.technocomjavaprj;

/**
 *
 * @author Technocom-21
 */
import com.tc.electronic.*;
public class TechnoComJavaPrj {

    public static void main(String[] args) {
       RCCar rc = new RCCar();
       rc.on();
       rc.off();
       
       Lamp lamp = new Lamp();
       lamp.on();
       lamp.off();
    }
}
