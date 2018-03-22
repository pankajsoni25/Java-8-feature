package com.zaneacademy.stream.video17;

import com.zaneacademy.stream.video16.Person1;

import java.util.Arrays;
import java.util.List;

/**
 * @author pankaj
 */
public class Driver {


    static List<Person1> populatePersons() {
        Person1 p1 = new Person1("person1", "US");
        Person1 p2 = new Person1("person2", "US");
        Person1 p3 = new Person1("person3", "Brazil");
        Person1 p4 = new Person1("person4", "US");
        Person1 p5 = new Person1("person5", "Brazil");
        Person1 p6 = new Person1("person6", "US");
        Person1 p7 = new Person1("person7", "Germany");
        Person1 p8 = new Person1("person8", "US");
        return Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public static void main(String[] args) {

    }
}
