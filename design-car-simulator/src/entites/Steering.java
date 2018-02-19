/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author ae
 */
public class Steering implements I_Part {

    public Bearing newDirection, currentDirection;

    public Steering(Bearing newDirection) {
        this.newDirection = newDirection;
    }

     String name;
    
    
 @Override
    public void setName(String partName) {
        this.name = partName;
     }

    @Override
    public String getName() {
        return this.name;
     }
    
    // The new bearing is
    public void compute() {
        currentDirection = this.newDirection; //this.degrees;
    }

    private static class Bearing {

        public Bearing(float degrees) {
        }
    }

    public static void main(String args[]) {

    }
    
}
