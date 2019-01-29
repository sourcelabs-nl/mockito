package nl.sourcelabs.mockito.domain;

public enum Country {

    NL("Nederland"), BE("Belgie"), FR("Frankrijk"), DE("Duitsland");

    private String fullname;

    Country(final String fullname) {
        this.fullname = fullname;
    }
}
