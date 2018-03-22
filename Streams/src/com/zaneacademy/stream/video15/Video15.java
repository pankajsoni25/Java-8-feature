package com.zaneacademy.stream.video15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pankaj
 */
public class Video15 {

    static List<Person> populatePersons(){
        Person p1 = new Person("person1","US");
        Person p2 = new Person("person2","Mexico");
        Person p3 = new Person("person3","Canada");
        Person p4 = new Person("person4","US");
        return Arrays.asList(p1,p2,p3,p4);
    }

    public static void main(String[] args) {
        List<Person> list = populatePersons();

        System.out.println("------Ids of all person from the US ( using filter + map + forEach )--");
        List<Person> us = list.stream()
                .filter(p -> p.getCountry().equals("US")).collect(Collectors.toList());

        list.stream()
                .filter(p -> p.getCountry().equals("US"))
                .map((Person person)-> "id : "+ person.getId()+" country : "+ person.getCountry())
                .forEach(System.out::println);


//        System.out.println(us);
        System.out.println();
        System.out.println("------Ids of all person not from the US ( using filter + map + forEach )--");
        list.stream()
                .filter(p -> !p.getCountry().equals("US"))
                .map((Person person)-> "id : "+ person.getId()+" country : "+ person.getCountry())
                .forEach(System.out::println);


        System.out.println();
        System.out.println("------using <A> A[] toArray(IntFunction<A[]> generator ) method --");
        Person[] people = list.stream().toArray(Person[]::new);

        Arrays.stream(people).forEach(System.out::println);
        System.out.println();
        System.out.println("------using Object[] toArray() method-----");
        Object[] objects = list.stream().toArray();
        System.out.println(objects);

    }




}
