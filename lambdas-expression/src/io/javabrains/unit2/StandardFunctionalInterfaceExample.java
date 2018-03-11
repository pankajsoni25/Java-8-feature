package io.javabrains.unit2;

import io.javabrains.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author pankaj
 */
/*Standard */
public class StandardFunctionalInterfaceExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );
        performConditionally(people, p -> p.getLastName().startsWith("C"));
        /*TODO:  Here I want Extra feature which will pass as argument and
        * Perform action in that method only
        * So We can use Consume<T> and not thing will return It's void type
        * nothing will return.
        * This is functional interface whose functional method is => accept(Object) */

        /*Consumer :
        * TODO: that accept a single input argument and return no result */
        System.out.println();
        System.out.println("Now Using Consumer");
        performConditionally(people, p -> p.getLastName().startsWith("C"));
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getLastName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate){
        for (Person p : people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }
    /* reason for creating this method is to perform sout() by accepting argument by invoker*/
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person p : people){
            if(predicate.test(p)){
            consumer.accept(p);
                //            System.out.println(p);
            }
        }
    }




}
