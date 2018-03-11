package io.javabrains.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author pankaj
 */
public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Corroll",42),
                new Person("Thomos","Carlyle",51),
                new Person("Charlotte","Bornte",45),
                new Person("Matthew","Arnold",39)
        );

        // Step 1: Sort List by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        /*TODO : alternate solution 1 using expression using Java 8 */
        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()) );

       /*TODO : alternate solution 1 using expression using Java 8 */
       Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()) );


        // Step 2: Create Method that prints all elements in the list
        System.out.println("Printing All person");
        printAll(people);

        // Step 3: Create Method that prints all people that have last name beginning with C
        System.out.println("Prints all people that have last name beginning with C");
        printLastNameBeginningWithC(people);

        // Step 4: Create Method based on Conditionally
        System.out.println("prints all people that have last name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

         /*TODO : alternate solution 4 using expression using Java 8 */
        System.out.println("prints all people that have last name beginning with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        Unit1ExerciseSolutionJava8.testAlternateSolutionSetp1(people);
    }

    private static void testAlternateSolutionSetp1(List<Person> people) {
        System.out.println("===============");
        Collections.sort(people,Comparator.comparing(Person::getFirstName));
        printAll(people);
    }

    private static void printLastNameBeginningWithC(List<Person> people) {
        for (Person p : people){
            if (p.getLastName().startsWith("C")){
                System.out.println(p);
            }
        }
    }

    private static void printConditionally(List<Person> people,Condition condition) {
        for (Person p : people){
            if (p.getLastName().startsWith("C")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people){
            System.out.println(p);
        }

    }



}
