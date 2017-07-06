package patterns.repository;

/**
 * @author yvesbeutler
 * This model class represents a simple customer.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isFemale;

    Customer(String firstName, String lastName, int age, boolean isFemale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }

    int getAge() {
        return age;
    }

    boolean isFemale() {
        return isFemale;
    }
}
