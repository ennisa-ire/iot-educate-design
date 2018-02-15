/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import design.I_Part;

/**
 *
 * @author ae
 */
public class Engine implements I_Part{

    private String size;

    public Engine(String size) {
        this.size = size;
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
    
    public void start() {

    }
public static void main(String args[]) {

    }
}
