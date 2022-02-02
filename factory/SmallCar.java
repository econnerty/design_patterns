package factory;

/**
 * SmallCar class
 * @author Erik Connerty
 */

public class SmallCar extends Car {

    public SmallCar(String make, String model) {
        super(make, model);
    }
    
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    protected void addAccessories() {

        this.accessories.add(Accessories.FLOOR_MATS);
        this.accessories.add(Accessories.PHONE_CHARGER);
        
    }
}
