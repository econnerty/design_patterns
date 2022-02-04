package factory;

import java.util.ArrayList;

/**
 * Car class
 * @author Erik Connerty
 */

public abstract class Car {
    
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    /**
     * Constructor for a car
     * @param The car's make
     * @param The car's model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Calls the respective functions to assemble the car.
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    
    protected abstract void addFrame();

    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    protected void addEngine() {

        System.out.println("Adding a Standard Engine");

    }

    protected void addWindows() {

        System.out.println("Adding Windows");

    }

    protected abstract void addAccessories();

    protected void displayAccessories() {

        System.out.println("Accessories:");

        for(Accessories a : accessories ) {
            System.out.println("- " + a);
        }

    }

}
