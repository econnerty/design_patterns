package factory;

/**
 * SmallCar class
 * @author Erik Connerty
 */

public class SmallCar extends Car {

    public SmallCar(String make, String model) {
        super(make, model);
    }
    
    /**
     * Implements abstract function and adds a frame
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Accessories for Small Car
     */
    protected void addAccessories() {

        this.accessories.add(Accessories.FLOOR_MATTS);
        this.accessories.add(Accessories.PHONE_CHARGER);

    }
}
