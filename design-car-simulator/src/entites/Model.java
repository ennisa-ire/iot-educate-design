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
public class Model implements I_Part {

    private String name;
    private String version;

    public Model(String name, String version) {
        this.name = name;
        this.version = version;
    }
 
    @Override
    public void setName(String partName) {
        name=partName;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public static void main(String args[]) {
        
        Model mini = new Model("mini", "500");
        Model maxi = new Model("maxi", "1000");
        
    }

   
}
