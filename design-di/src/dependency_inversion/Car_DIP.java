/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency_inversion;
 
import business.Cost;
import business.Model;
import components.Part;
import java.util.ArrayList;





/**
 *
 * @author ae
Responsibliity
* is to hold the components together!!!!
* It should only change if, new parts are added to the car!!!

 */
public class Car_DIP {
    
    Cost cost;      
    Model model;
    ArrayList<Part> parts; // Car depends on parts to be a car!!!
    
    
    // Losely Coupled
    public void setCost(Cost cost) {
        // if not  null - else throug paramter exception!!!
    };
    public void setModel(Model model) {
        // if not  null - else throug paramter exception!!!
    };

    public void addPart(Part part) {
        // if not  null - else throug paramter exception!!!
        parts.add(part);
    };
    
}
