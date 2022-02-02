package factory;

/**
 * CarFactory class
 * @author Erik Connerty
 */

public class CarFactory {

    public static Car createCar(String type, String make, String model) {

        Car car;

        System.out.println("Creating a " + make + " " +model);

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
