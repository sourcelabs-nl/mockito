package nl.sourcelabs.mockito.domain;

public class Address {

    private int houseNumber;
    private String street;
    private City city;

    public Address(final int houseNumber, final String street, final City city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }
}
