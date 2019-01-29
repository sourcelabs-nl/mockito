package nl.sourcelabs.mockito;
import static org.mockito.Mockito.mock;

import nl.sourcelabs.mockito.domain.Address;
import nl.sourcelabs.mockito.domain.City;
import nl.sourcelabs.mockito.domain.Country;
import nl.sourcelabs.mockito.domain.Customer;
import org.junit.Test;

public class AddressBookTest {


    @Test
    public void should_add_to_address_book_with_real_object() {
        Customer dummy = createDummyCustomer();

    }

    @Test
    public void should_add_to_address_book_with_null() {
        Customer dummy = null;

    }

    @Test
    public void should_add_to_address_book_with_mock() {
        Customer dummy = mock(Customer.class);

    }

    private Customer createDummyCustomer() {
        City city = new City("Rotterdam", Country.NL);
        Address address = new Address(1234,"Bank straat", city);
        return new Customer("john", "dobie", address);
    }

}
