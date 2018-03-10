package reasonForOptional;

import test.Address;
import test.Country;
import test.User;

/**
 * @author pankaj
 */
public class TestMain {

    User user = new User();


    public static void main(String [] args){
        /* TODO Set Country Values*/
        Country country = new Country();
        country.setCountryName("INDIA");
        country.setCountryCode("IND");
        country.setIsoCode("XXX-YYY");

        /*TODO In Address set Country */
        Address address = new Address();
        address.setPinCode("583005");

        /*TODO Set Address In User */
        User user = new User();
//        user.setCountry(country);
        user.setAddress(address);
        user.setName("Pankaj");

        System.out.println(user);

        /* Now If I have to get iso code By user Object Then I have to check all the Validation
        *  with Whether user Object is null or not then Check address present or not
        *  then I have to check Is Country is null or not, if not then only i will get
        *  iso code for the particular User*/
        System.out.println(user.getAddress().getCountry().getIsoCode().toUpperCase());




    }
}
