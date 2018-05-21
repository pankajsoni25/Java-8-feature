package com.stream.IntegerStram;

import java.util.Arrays;
import java.util.List;

public class StreamListFilter {

    public static void main(String[] args) {

        // 7. Stream from List, Filter, and print
        List<String> list = Arrays.asList("Al","Ankit","Brent","Sarika","amanda","Hansa","Shivika","Saran");

        list.stream()
                .map(String::toLowerCase)
//                .sorted()
                .filter(x->x.startsWith("a"))
                .forEach(System.out::println);




    }


}
