package factory;

import java.util.ArrayList;

/**
 * Car class
 * @author Erik Connerty
 */

public class Car {
    
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    public Car(String make, String model) {
        
    }

    public void assemble() {

    }

    protected void addFrame() {

    }

}
