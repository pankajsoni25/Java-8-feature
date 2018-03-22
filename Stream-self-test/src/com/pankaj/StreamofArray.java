package com.pankaj;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class StreamofArray {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a","b","c");
        stringStream.forEach(System.out::println);

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 0, 3);
        streamOfArrayPart.forEach(System.out::println);

    }



}
