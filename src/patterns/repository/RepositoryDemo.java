package patterns.repository;

/**
 * @author yvesbeutler
 * This class demonstrates the use of the repository pattern with a mocked data source
 * and random data. The repository strictly controlls every data access.
 */
public class RepositoryDemo {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepository();

        System.out.println("All customers:");
        System.out.println(repo.getAllCustomers());
        System.out.println();
        System.out.println("All customers sorted by age");
        System.out.println(repo.getCustomersSortedByAge());
        System.out.println();
        System.out.println("All female customers");
        System.out.println(repo.getAllFemaleCustomers());

    }
}
