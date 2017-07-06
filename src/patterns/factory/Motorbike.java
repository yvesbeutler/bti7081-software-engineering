package patterns.factory;

public class Motorbike implements Vehicle {
    @Override
    public void getInformation() {
        System.out.println("The motorbike is really cool and the driver gets all ladies");
    }
}