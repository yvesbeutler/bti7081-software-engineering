package patterns.factory;

class VehicleFactory {

    Vehicle getVehicle(String type) {
        switch (type) {
            case "car":
                return new Car();
            case "motorbike":
                return new Motorbike();
            case "bicycle":
                return new Bicycle();
            default:
                return null;
        }
    }
}