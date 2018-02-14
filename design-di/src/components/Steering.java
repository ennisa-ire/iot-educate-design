/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author ae
 */
public class Steering {

    public Bearing newDirection, currentDirection;

    public Steering(Bearing newDirection) {
        this.newDirection = newDirection;
    }

    // The new bearing is
    public void compute() {
        currentDirection = this.newDirection; //this.degrees;
    }

    private static class Bearing {

        public Bearing(float degrees) {
        }
    }

}
