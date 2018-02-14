/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single_responsibility;

import business.Cost;
import business.Model;
import components.Part;
import java.util.ArrayList;

/**
 *
 * @author ae 
 * 
 * Responsibliity is to hold the components together!!!! 
 * It should only change if, new parts are added to the car!!!
 *
 */

public class Car_SRP {

    Cost cost;
    Model model;
    // Car depends on parts to be a car!!!
    // Car will change if no. of parts are add/removed, 
    // car should not change if the cost changes? or the model changes?
    ArrayList<Part> parts; 

     public void setCost(Cost cost) {
        // if not  null - else throug paramter exception!!!
    }

    
    public void setModel(Model model) {
        // if not  null - else throug paramter exception!!!
    }

    

    public void addPart(Part part) {
        // if not  null - else throug paramter exception!!!
        
        if (model == "")
            parts.add(part);
        if (cost= "")
            parts.add(part);
    }


}
