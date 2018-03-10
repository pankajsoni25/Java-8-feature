package reasonForOptional;

import test.Address;
import test.Country;
import test.User;

import java.util.Optional;

/**
 * @author pankaj
 */
public class TestMain {

    public static User user = null;


    public static void main(String [] args){

        TestMain t = new TestMain();
        User newUser = t.createUserObject();
        System.out.println(newUser);
        user = new User();
        user = newUser;

        t.createUserObject();

        /* Now If I have to get iso code By user Object Then I have to check all the Validation
        *  with Whether user Object is null or not then Check address present or not
        *  then I have to check Is Country is null or not, if not then only i will get
        *  iso code for the particular User*/
        System.out.println(newUser.getAddress().getCountry().getIsoCode().toUpperCase());

        /*TODO like below I am doing Like that I have to check*/
        User user1 = newUser;
        if(user1 != null){
            if(user1.getAddress() != null){
                if(user1.getAddress().getCountry() != null){
                    if(user1.getAddress().getCountry().getIsoCode() != null){
                        System.out.println(user1.getAddress().getCountry().getIsoCode());
                    }
                }
            }
        }
        System.out.println("--------------Ending -----------Old we were doing-------------");

        System.out.println("--------------------Optional using the way -----------------");
        TestMain.nowCheckUsingOptional(newUser);
        TestMain.accessingTheValueOfOptionalObjects(newUser);
        TestMain.checkValueIsPresentOrNot(newUser);
        TestMain.checkValueIsPresentOrNotThenGoAhead(newUser);

    }


    public User createUserObject(){
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

    public User shareUserObjectWithOtherClasses() {
        User u = TestMain.user;
        System.out.println("user ");
        System.out.println(u);
        return u;
    }

    /* Another option for checking the presence of a value is the ifPresent() method.
     * In addition to performing the check, this method also takes a Consumer argument and executes the lambda expression
     * if the object is not empty: ifPresentOrElse() , ifPresent() */
    private static void checkValueIsPresentOrNotThenGoAhead(User user) {
        Optional<User> optional = Optional.ofNullable(null);

        System.out.println(optional.isPresent());

        System.out.println("11111111");
        optional.ifPresentOrElse(u ->{
            System.out.println("Value is present ");
        },() -> {
            System.out.println("Value is not present ");
        });

        System.out.println("222222222");

        Optional<User> optional1 = Optional.ofNullable(user);
        System.out.println(optional1.isPresent());
        optional1.ifPresentOrElse(u ->{
            System.out.println("Value is present ");
        },() -> {
            System.out.println("Value is not present ");
        });

        System.out.println("333333333");
        optional.ifPresent(u ->{
            System.out.println("Value is present ");
        });

        System.out.println();
        System.out.println("Ending----------checkValueIsPresentOrNotThenGoAhead() --");
    }

    /*TODO read first before going ahead*/
    /* However, as you saw before, this (optional.get()) method throws an exception in case the value is null.
    * To avoid this exception,
    * you can choose to first verify if a value is present or not: by -> optional.isPresent()
    */
    private static void checkValueIsPresentOrNot(User user) {
        Optional<User> u = Optional.ofNullable(null);
        System.out.println(u.isPresent());

        Optional<User> u1 = Optional.ofNullable(user);
        System.out.println(u.isPresent());



    }

    private static void accessingTheValueOfOptionalObjects(User user) {
        String s = "Pankaj";
        Optional<String> opt = Optional.ofNullable(s);
        System.out.println(opt.get());

        Optional<User> user1 = Optional.ofNullable(user);
        System.out.println(user1.get());

    }

    private static void nowCheckUsingOptional(User user) {
        /*TODO: 1)  Creating Optional Instances */
        Optional<User> empOpt = Optional.empty();
//        empOpt.get().setName("Pankaj");
//        System.out.println(empOpt.get());

        /*TODO 2) To create an Optional object that can contain a value – you can use the of()
          TODO: and ofNullable() methods*/
        /*The difference between the two is that the of() method will throw a NullPointerException
          if you pass it a null value as an argument:*/
        Optional<User> u1 = Optional.of(user);
        System.out.println(u1);

        /*
        * u2 this will throw null pointer Exception but see the u4 which will not throw
        * this means when u sure user will not null then use of() else use ofNullable()
        * If the object can be both null or not-null, then you should instead choose the ofNullable() method:
        * */
//        Optional<User> u2 = Optional.of(null);
        Optional<User> u3 = Optional.ofNullable(user);
        Optional<User> u4 = Optional.ofNullable(null);

//        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);

    }
}
