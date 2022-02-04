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
         * Check for the car type. Return null if the type does not exist.
         */
        if(type.equalsIgnoreCase(CarType.SMALL.toString())) {
            car = new SmallCar(make, model);
        }
        else if(type.equalsIgnoreCase(CarType.SEDAN.toString())) {
            car = new SedanCar(make, model);
        }
        else if(type.equalsIgnoreCase(CarType.LUXURY.toString())) {
            car = new LuxuryCar(make, model);
        }
        else {
            return null;
        }

        
        car.assemble();
        return car;

    }
    
}
