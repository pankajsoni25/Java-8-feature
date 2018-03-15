package io.brains;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pankaj
 */
public class StreamExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );

        people.stream()
                .filter(p->p.getLastName().startsWith("C")).collect(Collectors.toList())
                .forEach(p-> System.out.println(p.getFirstName()));

        System.out.println(people);

        long count = people.stream().filter(p -> p.getLastName().startsWith("C")).count();
        System.out.println(count);



    }

}
