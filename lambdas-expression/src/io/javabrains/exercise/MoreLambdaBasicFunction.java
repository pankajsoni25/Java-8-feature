package io.javabrains.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author pankaj
 */
public class MoreLambdaBasicFunction {


    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );
        printConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    /* Here I am passing Predicate as Interface instead of Condition
    * because there was only one method in the Condition for Type
    * Accepting by the lambda expression
    * So, Java 8 Provides Interface So we can directly use Instead to separate
    * creating interface.
    * So we here no need to create Separate Interface for using lambda expression
    * instead of use Predicate.
    * Predicate Interface has only one abstract method which is test
    * which will return boolean
    * Anyway see this example and See java doc for more about Predicate*/

    /* How To use ? */
    /* Only we need to accept Predicate and when we call this method only
    * pass lambda expression instead of predicate parameter */
    /* See More about functional interface Java Docs of Functional Interface */
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people){
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }
}
