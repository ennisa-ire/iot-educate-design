/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;
 
import entites.Assembley;
import entites.Model;
import entites.Breaks;
import entites.Engine;
import entites.Part;
import entites.Steering;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import boundary.Dashboard;

/**
 *
 * @author ae
 * I am a client class, to do want I want to do, i will need the following.
 */
public class StartUp {
    // Welcome to the Runtime Engine - Herby Goes Bananas!!!
    
    // Inputs
    // 1. Model

// Experience
    // 2. Speed
    // 3. Direction

// Experience
    // 4. Music Selection
    // 5. Scenario Selection


    // Lets Start To Drive!!!! Press Q to quit, up/down to control speed. 
    
    public static void main (String args[]) throws InterruptedException {
        
        Dashboard dash = new Dashboard("0", "0", "0", "0", "0");
        Model model = null;

        Assembley car = new Assembley();
        // Spawn a new thread 
    
        // Select Model
        
        if (model.getName().contains("maxi") ) {
            // Assemble Maxi
            car.addPart(new Engine("1000")).addPart(new Breaks("Shamano")).addPart(new Steering(null));
        
        } else {
            // Assemble Mini
            
        }
        
        // Initialise Dashboard
        
        // Read Input
        while (true) {            
            Thread.sleep(1000);
            try {
                
                int x = System.in.read();

                // Update State
                if (x == 25) {
                    // inc speed 
                    dash.setSpeed("10");
                    // update dashboard
                }
                
            } catch (IOException ex) {
                Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        // Swing It!!!
        
    
    
    
    }

}
