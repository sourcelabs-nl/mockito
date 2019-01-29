package nl.sourcelabs.mockito.domain;

public class City {

    private String cityName;
    private Country country;

    public City(final String cityName, final Country country) {
        this.cityName = cityName;
        this.country = country;
    }
}
