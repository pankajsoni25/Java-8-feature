package com.pankaj;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class StreamIterate {

    public static void main(String[] args) {

        /**
         * Another way of creating an infinite stream is by using the iterate() method:
         * */

        Stream<Integer> stream = Stream.iterate(40, n -> n + 2).limit(20);
//        stream.forEach(System.out::println);
//        stream.map(a -> a + 2 ).collect(Collectors.toList()).forEach(System.out::println);
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);


    }


}
