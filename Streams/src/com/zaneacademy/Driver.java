package com.zaneacademy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class Driver {

    static List<String> stringList = populateList();
    static Map<String,String> map = populateMap();

    public static void main(String[] args) {
        System.out.println("-------------obtaining Stream From List ----------");
        stringList.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("-------- obtaining Stream from Map using entrySet() -------");
        map.entrySet().forEach(System.out::println);

        System.out.println();
        System.out.println("---------obtaining Stream from Map using keySet()");
        map.keySet().forEach(System.out::println);


        System.out.println();
        System.out.println("---------obtaining Stream from Map using values()");
        map.values().stream().forEach(System.out::println);
        System.out.println();
        System.out.println("---------obtaining a Stream from String using chars()");
        "15151515safdasf".chars().forEach(x-> System.out.println(Character.toChars(x)));

        System.out.println();
        System.out.println("---------obtaining a Stream from String using splits()");
        Stream.of("A,B,C,D".split(",")).forEach(System.out::println);

        System.out.println();
        System.out.println("---------obtaining Stream from Array-------");
        Integer [] integers = {0,1,2,3,4,5,6,7,8,9};
        Arrays.stream(integers).forEach(System.out::println);
        Stream.of(integers).forEach(System.out::println);


        System.out.println();

        System.out.println("---------obtaining Stream from values ---------");
        Stream.of("Stream","of","values").forEach(System.out::println);
        System.out.println();
        System.out.println("---------obtaining Stream from Function generate -----");
        Stream.generate(Math::random).limit(20).forEach(System.out::println);
        System.out.println();

        System.out.println("---------obtaining Stream from Function iterate ------");
        Stream.iterate(0,i->i+1).limit(30).forEach(System.out::println);

        System.out.println();
        System.out.println("---------obtaining Stream from builder --------");
        Stream.builder().add("one").add("two").add("three").build().forEach(System.out::println);

        System.out.println();
        System.out.println("---------obtaining Stream from another stream ---------");
        System.out.println();
        populateList().stream().distinct().limit(2).sorted().forEach(System.out::println);
        System.out.println();


    }

    private static List<String> populateList(){
        List<String> stringList = Arrays.asList(
                "listval1","listval2","listval3","listval1","listval2","listval4"
        );
        return stringList;
    }

    private static Map<String,String> populateMap(){
        Map<String,String> map = Map.ofEntries(Map.entry("mapKey1","mapVal1"),
                Map.entry("mapkey2","mapVal2"),
                Map.entry("mapkey3","mapVal3")
        );

        return map;
    }



}
