package factory;

/**
 * SedanCar class
 * @author Erik Connerty
 */

public class SedanCar extends Car {
    
    public SedanCar(String make, String model) {
        super(make, model);
    }

    /**
     * Implements abstract function and adds a frame
     */
    protected void addFrame() {

        System.out.println("Adding a three part frame");

    }

    /**
     * Accessories for Sedan Car
     */
    protected void addAccessories() {

        this.accessories.add(Accessories.FLOOR_MATTS);
        this.accessories.add(Accessories.PHONE_CHARGER);
        this.accessories.add(Accessories.BACK_UP_CAMERA);
        this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        this.accessories.add(Accessories.HEATED_SEATS);

    }
}
