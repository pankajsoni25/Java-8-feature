package io.javabrains.unit3;

import io.javabrains.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author pankaj
 */
public class MethodReferenceExample2 {

    /* See Rules For use method references */
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );

        performConditionally(people, p -> true, p -> System.out.println(p.getLastName()));
        /*Whenever We have lambdas like this
        * p->method(p) === can be replace with MethodReferences::methodReference
        * */
        System.out.println("Method References ---------");
        performConditionally(people, p -> true, System.out::println);


    }

    public static void printMessage() {
        System.out.println("Hello ");
    }

    /* reason for creating this method is to perform sout() by accepting argument by invoker*/
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        System.out.println("Inside Perform");
        for (Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
                System.out.println("Inside Perform if ");

                //            System.out.println(p);
            }
        }
    }



}
