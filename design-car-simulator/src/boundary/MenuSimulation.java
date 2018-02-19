/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import java.util.Scanner;

/**
 *
 * Boundary Class, will send a message to controller.
 */
public class MenuSimulation implements I_Menu {

    // I have the car physics. 
    // * I need to pass this data to car object!!
    // * Refresh Menu, and start car
    
    String speed;
    String direction;

    // https://www.youtube.com/watch?v=I3usNR8JrEE
  
    Scanner scanner;

    public MenuSimulation() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void inputs() {
        System.out.print("1. Select Target Speed [Max 100 kph] : ");
        this.speed = scanner.nextLine();
        System.out.print("2. Select Bearing [North,East,West] : ");
        this.direction = scanner.nextLine();
        
        // Got the inputs lets drive!!!
        
    }

    @Override
    public void outputs() {
        System.out.println("Current Speed : " + speed);
        System.out.println("Bearing : " + direction);

    }

    @Override
    public void refresh() {

    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        MenuSimulation m = new MenuSimulation();
        m.inputs();
        m.outputs();
    }

    

}
