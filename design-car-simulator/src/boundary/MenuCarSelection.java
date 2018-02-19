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
public class MenuCarSelection implements I_Menu {

    // I have the car details. Combo Box
    // Update Menu, with driving menu.
 
    
    String engineSize;
    String model;
    String breaks;

    String speed;
    String direction;

    
    Scanner scanner;

    public MenuCarSelection() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void inputs() {
        System.out.print("1. Select Engine Size [500, 1000] : ");
        this.engineSize = scanner.nextLine();
        System.out.print("2. Select Model [mini, maxi] : ");
        this.model = scanner.nextLine();
        
        // Got the inputs lets drive!!!
        
    }

    @Override
    public void outputs() {
        System.out.println("Engine Size : " + engineSize);
        System.out.println("Model : " + model);

    }

    @Override
    public void refresh() {

    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        MenuCarSelection m = new MenuCarSelection();
        m.inputs();
        m.outputs();
    }

    

}
