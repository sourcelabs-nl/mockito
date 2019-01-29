package nl.sourcelabs.mockito;
import nl.sourcelabs.mockito.domain.Address;
import nl.sourcelabs.mockito.domain.City;
import nl.sourcelabs.mockito.domain.Country;
import nl.sourcelabs.mockito.domain.Customer;

public class CustomerRepository {

    public Customer getCustomer(String name) {
        City city = new City("Rotterdam", Country.NL);
        Address address = new Address(1234,"Bank straat", city);
        return new Customer(name, "Jansen", address);
    }
}
