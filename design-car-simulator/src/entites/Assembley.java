/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;
 
import entites.I_Part;
import java.util.ArrayList;





/**
 *
 * @author ae
Responsibliity
* is to hold the components together!!!!
* It should only change if, new parts are added to the car!!!

 */
public class Assembley {
    
    ArrayList<I_Part> parts =  new ArrayList<>(); // Car depends on parts to be a car!!!
    

    public Assembley addPart(I_Part part) {
        // if not  null - else throug paramter exception!!!
        parts.add(part);
        return this;
    };
    
}
