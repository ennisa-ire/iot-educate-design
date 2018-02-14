/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single_responsibility;

import java.util.ArrayList;

/**
 *
 * @author ae
 * 1. 
 */
public class Car {
    Cost cost;
    Model model;
    ArrayList<Part> parts;

    
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
