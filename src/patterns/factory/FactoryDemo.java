package patterns.factory;

/**
 * @author yvesbeutler
 * This class demonstrates the usage of the factory pattern with different kind of vehicles.
 * Every instance is created over the {@link VehicleFactory} the same way.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        Vehicle v2 = factory.getVehicle("motorbike");
        Vehicle v3 = factory.getVehicle("bicycle");

        v1.getInformation();
        v2.getInformation();
        v3.getInformation();
    }
}
