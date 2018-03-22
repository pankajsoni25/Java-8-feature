package com.zaneacademy.stream.video16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pankaj
 */
public class Driver {

    static List<Person1> populatePersons(){
        Person1 p1 = new Person1("person1","US");
        Person1 p2 = new Person1("person2","US");
        Person1 p3 = new Person1("person3","Brazil");
        Person1 p4 = new Person1("person4","US");
        Person1 p5 = new Person1("person5","Brazil");
        Person1 p6 = new Person1("person6","US");
        Person1 p7 = new Person1("person7","Germany");
        Person1 p8 = new Person1("person8","US");
        return Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
    }

    public static void main(String[] args) {
        List<Person1> list = populatePersons();
        System.out.println("-----Obtain US and non US based person using partitioningBy & groupingBy ----");
//        System.out.println(list.stream().collect(Collectors.partitioningBy(p -> p.getCountry().equals("US"))));
        System.out.println(list.stream().collect(Collectors.partitioningBy((Person1 p) -> p.getCountry().equals("US"))));
        System.out.println(list.stream().collect(Collectors.groupingBy((Person1 p) -> !p.getCountry().equals("US"))));

        System.out.println();
        System.out.println("-----count US and non US based person using partitioningBy & groupingBy ----");
        System.out.println(list.stream().collect(Collectors.partitioningBy((Person1 p) -> p.getCountry().equals("US"),
                Collectors.counting())));
        System.out.println(list.stream().collect(Collectors.groupingBy((Person1 p) -> !p.getCountry().equals("US"),
                Collectors.counting())));

        System.out.println();
        System.out.println("-----Obtain the person in each country  and count then using groupingBy ----");

//      below will not work so will use grouping
  System.out.println(list.stream().collect(Collectors.groupingBy(p-> p.getCountry())));
        System.out.println(list.stream().collect(Collectors.groupingBy(p->p.getCountry(),Collectors.counting())));


        System.out.println();
        System.out.println("-----Obtain US and non US based persons using partitioningBy & map names to upperCase using mapping ----");
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(p->p.getCountry().equals("US"),
                        Collectors.mapping(p->p.getId().toUpperCase(),
                                Collectors.toList()))));


        System.out.println();
        System.out.println("-----Obtain the person in each country using groupingBy & map names to upperCase using mapping ----");
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(p->p.getCountry(),
                        Collectors.mapping(p->p.getId().toUpperCase(),
                                Collectors.toList()))));


    }


}
