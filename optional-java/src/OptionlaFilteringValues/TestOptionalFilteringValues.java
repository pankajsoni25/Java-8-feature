package OptionlaFilteringValues;

import reasonForOptional.TestMain;
import test.User;

import java.util.Optional;

/**
 * @author pankaj
 */
/*
* Alongside transforming the values,
* the Optional class also offers the possibility to “filter” them based on a condition.
* */
public class TestOptionalFilteringValues {

    public static void main(String[] a){
        TestMain test = new TestMain();
        User user = test.createUserObject();
        TestOptionalFilteringValues.testFilter(user);

    }

    /*
    * The filter() method takes a Predicate as an argument and returns
    * the value as it is if the test evaluates to true.
    * Otherwise, if the test is false, the returned value is an empty Optional.*/
    private static void testFilter(User user) {
        Optional<User> opt = Optional.ofNullable(user)
                .filter(u-> u.getName() != null && u.getAddress().getCountry().getIsoCode() != null);
        System.out.println("getting value "+opt.isPresent());
        System.out.println("getting value "+opt.get());
    }


}
