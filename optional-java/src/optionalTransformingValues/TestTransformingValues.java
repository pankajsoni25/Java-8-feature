package optionalTransformingValues;

import reasonForOptional.TestMain;
import test.User;

import java.util.Optional;

/**
 * @author pankaj
 */
public class TestTransformingValues {

    public static void main(String[] args){
        TestMain t = new TestMain();
        User user = t.createUserObject();
        TestTransformingValues.testMap(user);
        TestTransformingValues.testFlatMap(user);

    }

    /*
    * map() applies the Function argument to the value,
    * then returns the result wrapped in an Optional.
    * This makes it possible to apply and chain further operations on the response –
    * such orElse() here.*/
    private static void testMap(User user) {
        User u = null;
        String email = Optional.ofNullable(u)
                .map(d -> d.getName()).orElse("Last Name Empty");
        System.out.println(email);
        System.out.println(u);
    }

    private static void testFlatMap(User user) {
        User u = null;
        String email = Optional.ofNullable(u)
                .map(d -> d.getName()).orElse("Last Name Empty");
        System.out.println(email);
        System.out.println(u);
    }


}
