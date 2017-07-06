package patterns.factory;

public class Bicycle implements Vehicle {
    @Override
    public void getInformation() {
        System.out.println("The bicycle is a must have because intelligent people don't drink drive");
    }
}