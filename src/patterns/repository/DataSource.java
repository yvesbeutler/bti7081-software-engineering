package patterns.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yvesbeutler
 * This class represents any data source like a service, restful webservice or
 * relational database.
 */
class DataSource {

    static List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("phil", "collins", 52, false));
        customers.add(new Customer("elvis", "presley", 47, false));
        customers.add(new Customer("paris", "hilton", 36, true));
        customers.add(new Customer("paul", "mccartney", 68, false));
        customers.add(new Customer("justin", "bieber", 22, false));
        customers.add(new Customer("john", "travolta", 59, false));
        customers.add(new Customer("alison", "mosshart", 38, true));
        return customers;
    }
}
