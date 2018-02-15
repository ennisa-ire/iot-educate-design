/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author ae
 */
public class Model {

    private String name;
    private String version;

    public Model(String name, String version) {
        this.name = name;
        this.version = version;
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
