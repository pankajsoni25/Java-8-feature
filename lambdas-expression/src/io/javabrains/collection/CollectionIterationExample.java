package io.javabrains.collection;

import io.javabrains.exercise.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author pankaj
 */
public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );

        System.out.println("Using For Loop ! ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using For each Loop ! ");
        for (Person p : people) {
            System.out.println(p);
        }

        /*above bot iterate is external iteration where we handle for execution process
        * for each elements  by indexing and handle it
        *
        * Here We basically somebody else
        * */

        System.out.println("PPPPPPPPP");
        people.forEach(System.out::println);

        // .forEach(takes the consume{meanse the function interface of lambdas})

        /*
        Here we are telling i don't care about order just have to run this for
        each and every element how you run it up to you.
        So this makes, This makes it possible to run parallel this loop.

        This will execute parallel but above is execute sequentially
        * So This will become fast when we will using in multi threading
        * */
        people.forEach(person -> System.out.println(person));




    }
}
