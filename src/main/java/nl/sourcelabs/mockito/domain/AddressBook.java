package nl.sourcelabs.mockito.domain;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Customer> customers = new ArrayList<>();

    public AddressBook() {
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
