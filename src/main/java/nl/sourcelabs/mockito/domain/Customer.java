package nl.sourcelabs.mockito.domain;

public class Customer {

    private String firstName;
    private String lastName;
    private Address address;

    public Customer(final String firstName, final String lastName, final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
