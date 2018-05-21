package com.stream.IntegerStram;

import java.util.Arrays;

public class StreamFromArraySortFilter {

    public static void main(String[] args) {

        // Stream of Array, sort, Filter, print
        String[] arr = {"Al","Ankit","Kushal","Brent","amanda","Hans","Shivika","Sarika"};

        Arrays.stream(arr)          // same as Stream.of(arr)
                .filter(s -> s.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

    }


}
