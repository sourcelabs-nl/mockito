package nl.sourcelabs.mockito;

import nl.sourcelabs.mockito.domain.Customer;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerByName(String name) {
        if (name != null) {
            return customerRepository.getCustomer(name);
        }
        throw new IllegalArgumentException("Name can not be empty");
    }

}
