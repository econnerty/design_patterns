package factory;

/**
 * CarFactory class
 * @author Erik Connerty
 */

public class CarFactory {

    public static Car createCar(String type, String make, String model) {

        Car car;

        System.out.println("Creating a " + make + " " +model);

        if (type.equalsIgnoreCase("small")) {
            car = new SmallCar(make, model);
        }
        else if (type.equalsIgnoreCase("sedan")) {
            car = new SedanCar(make, model);
        }
        else if (type.equalsIgnoreCase("luxury")) {
            car = new LuxuryCar(make, model);
        }
        else {
            return null;
        }
        car.assemble();
        return car;

    }
    
}
