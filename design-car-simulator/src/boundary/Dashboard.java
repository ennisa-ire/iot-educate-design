/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

/**
 *
 * @author ae
 */
public class Dashboard {
    String engineSize;
    String model;
    String breaks;
    
    String speed;
    String direction;

    public Dashboard(String engineSize, String model, String breaks, String speed, String direction) {
        this.engineSize = engineSize;
        this.model = model;
        this.breaks = breaks;
        this.speed = speed;
        this.direction = direction;
    }
    
    
    
    public void updateDash() {
        // Print To Console
        System.out.println("INF : engineSize => ("+this.engineSize+")");
        System.out.println("INF : Model => ("+this.model+")");
        System.out.println("INF : breaks => ("+this.breaks+")");
        System.out.println("INF : speed => ("+this.speed+")");
        System.out.println("INF : direction => ("+this.direction+")");
    }
    

 

    public Dashboard setEngineSize(String engineSize) {
        this.engineSize = engineSize;
                return this;

    }

    public Dashboard setModel(String model) {
        this.model = model;
                return this;

    }

    public Dashboard setBreaks(String breaks) {
        this.breaks = breaks;
                return this;

    }

    public Dashboard setSpeed(String speed) {
        this.speed = speed;
        return this;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
        
}
