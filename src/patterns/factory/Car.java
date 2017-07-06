package patterns.factory;

public class Car implements Vehicle {
    @Override
    public void getInformation() {
        System.out.println("The car is very useful to pick you up after a night of heavy drinking");
    }
}