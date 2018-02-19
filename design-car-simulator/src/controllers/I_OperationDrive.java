/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author ae
 */
public interface I_OperationDrive {

// Procedure : Steering  N indication
    public void bearing(String direction);


// Procedure :  Driving
    public void drive(int velocity);

// Procedure :  Parking
    public void reverse();
    public void stop();

}
