package patterns.repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yvesbeutler
 * This repository class provides different specific functions to
 * get all type of customers.
 */
class CustomerRepository {

    List<Customer> getAllCustomers() {
        return DataSource.getCustomers();
    };

    List<Customer> getCustomersSortedByAge() {
        List<Customer> customers = DataSource.getCustomers();
        customers.sort(Comparator.comparingInt(Customer::getAge));
        return customers;
    }

    List<Customer> getAllFemaleCustomers() {
        return DataSource.getCustomers().stream()
                .filter(Customer::isFemale)
                .collect(Collectors.toList());
    }

}
