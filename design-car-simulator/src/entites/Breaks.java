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
public class Breaks implements I_Part {
    private int force=0;
    String name;

    public Breaks(String shamano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 @Override
    public void setName(String partName) {
        this.name = partName;
     }

    @Override
    public String getName() {
        return this.name;
     }
    
    public void stop () {
        
    }

    public static void main(String args[]) {

    }

   

    
}
