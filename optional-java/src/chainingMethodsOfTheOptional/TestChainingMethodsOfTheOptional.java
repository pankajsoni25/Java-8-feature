package chainingMethodsOfTheOptional;

import reasonForOptional.TestMain;
import refectorClasses.User;
import refectorClasses.Country;
import refectorClasses.Address;

import java.util.Optional;

/**
 * @author pankaj
 */
public class TestChainingMethodsOfTheOptional {

    public static void main(String [] a){
        TestChainingMethodsOfTheOptional test = new TestChainingMethodsOfTheOptional();
        User user = test.createRefectorUser();
        TestChainingMethodsOfTheOptional.testChainMethodOfOptional(user);


    }

    /*
    * For more powerful uses of Optional,
    * you can also chain different combinations of most of its methods,
    * given that most of them return objects of the same type.
    */
    private static void testChainMethodOfOptional(User user) {

    String result = Optional.ofNullable(user)
            .flatMap(u-> u.getAddress())
            .flatMap(a->a.getCountry())
            .map(c->c.getCountryName())
            .orElse("default");
        System.out.println(result);

        /*
        * The code above can be further reduced by using method references:
        * */

        result = Optional.ofNullable(user)
                .flatMap(User::getAddress)
                .flatMap(Address::getCountry)
                .map(Country::getCountryName)
                .orElse("default");
        System.out.println(result);
    }

    public User createRefectorUser(){
        /* TODO Set Country Values*/
        Country country = new Country();
        country.setCountryName("INDIA");
        country.setCountryCode("IND");
        country.setIsoCode("XXX-YYY");

        /*TODO In Address set Country */
        Address address = new Address();
        address.setPinCode("583005");
        address.setCountry(country);

        /*TODO Set Address In User */
        User newUser = new User();
//        user.setCountry(country);
        newUser.setAddress(address);
        newUser.setName("Pankaj");
        return newUser;

    }

}
