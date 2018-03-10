package optionalApi;

import reasonForOptional.TestMain;
import test.User;

import java.util.Optional;

/**
 * @author pankaj
 */
public class TestMainOptionalApi {

    public static void main(String[] args){
        TestMain t = new TestMain();
        User user = t.createUserObject();
        System.out.println(user);
        TestMainOptionalApi.checkApiReturnDefaultValue(user);
        TestMainOptionalApi.testOrElseAndOrElseGet(user);

        TestMainOptionalApi test = new TestMainOptionalApi();
        test.differenceBetweenOrElseAndOrElseGet(user);

        TestMainOptionalApi.testOrElseThrow(user);
    }

    /*TODO throws an exception instead if the object is empty:*/
    private static void testOrElseThrow(User user) {

        /*
        * Here, if the user value is null, an IllegalArgumentException is thrown.
        * This allows us to have a lot more flexible semantics
        * and decide the exception that gets thrown instead of always seeing a NullPointerException.
        * */
        User u = null;
        User user1 = Optional.ofNullable(u).orElseThrow( ()-> new IllegalArgumentException());
    }

    private void differenceBetweenOrElseAndOrElseGet(User user) {
        User u = null;
        System.out.println("Using orElse");
        User user1 = Optional.ofNullable(u).orElse(this.printUser(user));

        System.out.println("Using orElseGet");
        User user2 = Optional.ofNullable(u).orElseGet(()->this.printUser(user));

        System.out.println("=========================================");

        /*
        * above see the if user is null then only both execute
        * now see in below carefully
        * orElse() will execute whether value will null or not
        * but in orElseGet() will execute only when we get null then only it will execute
        * */

        /*
        * Here, both Optional objects contain a non-null value which the methods will return.
        * However, the orElse() method will still create the default User object.
        * By contrast, the orElseGet() method will no longer create a User object.
        * */

        User x = user;
        System.out.println("Using orElse");
        User resultElse = Optional.ofNullable(x).orElse(this.printUser(user));

        System.out.println("Using orElseGet");
        User resultElseGet = Optional.ofNullable(x).orElseGet(()->this.printUser(user));
    }

    private User printUser(User user) {
        System.out.println("Creating New User");
        return user;
    }

    /*The second API in the same category is orElseGet() – which behaves in a slightly different manner.
    * In this case, the method returns the value if one is present,
    * and if not it executes the Supplier functional interface that it receives as an argument,
    * and returns the result of that execution:
    * */
    private static void testOrElseAndOrElseGet(User user) {
     User u = Optional.ofNullable(user).orElseGet(()->user);
        System.out.println(u);
    }

    /*
    * The Optional class provides APIs for
    * returning the value of the object or a default value if the object is empty.
    * */
    private static void checkApiReturnDefaultValue(User user) {
        User user1 = null;
        User u = Optional.ofNullable(user1).orElse(user);
        System.out.println(u);

    }




}
