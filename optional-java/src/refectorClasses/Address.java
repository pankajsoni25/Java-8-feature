package refectorClasses;

import java.util.Optional;

/**
 * @author pankaj
 */
public class Address {

    private String pinCode;

    private Country country;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Optional<Country> getCountry() {
        return Optional.ofNullable(country);
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode='" + pinCode + '\'' +
                ", country=" + country +
                '}';
    }
}
