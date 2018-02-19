/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entites.Car;
import entites.Engine;
import entites.I_Part;
import entites.Model;

/**
 *
 * @author ae
 */
public class ControlCar implements I_OperationDrive {

    // Controll Car
    // Send instructions to car entity
    
    // Car responds to controller job done, controller updates GUI.
    Car car;
    I_Part part;
    
    // Give me car to control
    public ControlCar(Engine engine, Model model) {
        this.car = new Car();
        
        this.car =  (Car) car.addPart(engine).addPart(model);

    }
        
    
    @Override
    public void bearing(String direction) {
       this.car.setDirection(direction);
       System.out.println("INF : Chatering new course ("+direction+")");
      
    }


    @Override
    public void drive(int velocity) {
       this.car.setSpeed(velocity);
       System.out.println("INF : Changing speed ("+velocity+")");
    }

    @Override
    public void reverse() {

    }

    @Override
    public void stop() {
          this.car.setSpeed(0);

     }

    public Car getCar() {
        return car;
    }
    
    
    
}
