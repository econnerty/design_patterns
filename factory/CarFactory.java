package factory;

/**
 * CarFactory class
 * @author Erik Connerty
 */

public class CarFactory {

    /**
     * Returns a car based off of the inputted parameters
     * @param The car's type
     * @param The car's make
     * @param The car's model
     * @return A car
     */
    public static Car createCar(String type, String make, String model) {

        Car car;

        System.out.println("Creating a " + make + " " +model);

        /**
         * Switch on the car type. Return null if the type does not exist.
         */
        switch (type) {

            case "small":
                car = new SmallCar(make, model);
                break;

            case "sedan":
                car = new SedanCar(make, model);
                break;

            case "luxury":
                car = new LuxuryCar(make, model);
                break;

            default:
                return null;
        }
        
        car.assemble();
        return car;

    }
    
}
