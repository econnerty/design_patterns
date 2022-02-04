package factory;

/**
 * LuxuryCar class
 * @author Erik Connerty
 */

public class LuxuryCar extends Car {
 
    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    /**
     * Implements abstract function and adds a frame
     */
    protected void addFrame() {

        System.out.println("Adding a beautiful frame");

    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }

    /**
     * Accessories for Luxury Car
     */
    protected void addAccessories() {

        this.accessories.add(Accessories.FLOOR_MATTS);
        this.accessories.add(Accessories.PHONE_CHARGER);
        this.accessories.add(Accessories.BACK_UP_CAMERA);
        this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        this.accessories.add(Accessories.HEATED_SEATS);
        this.accessories.add(Accessories.SPORT_SEATS);
        this.accessories.add(Accessories.WINDOW_TINT);
        this.accessories.add(Accessories.HIGH_END_SOUND);
        this.accessories.add(Accessories.TRUNK_ORGANIZER);
        this.accessories.add(Accessories.BLUE_TOOTH);

    }
}
