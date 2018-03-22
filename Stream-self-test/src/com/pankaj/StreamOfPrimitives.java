package com.pankaj;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class StreamOfPrimitives {

    public static void main(String[] args) {

        /*
        * Java 8 offers a possibility to create streams out of three primitive types: int, long and
        * double. As Stream<T> is a generic interface and there is no way to use primitives as a
        * type parameter with generics, three new special interfaces were created: IntStream,
        * LongStream, DoubleStream.
        *
        * Using the new interfaces alleviates unnecessary auto-boxing allows increased productivity:
        * */

        /**
         * The range(int startInclusive, int endExclusive) method creates an ordered stream from the
         * first parameter to the second parameter. It increments the value of subsequent elements
         * with the step equal to 1. The result doesn’t include the last parameter, it is just an
         * upper bound of the sequence.


         * The rangeClosed(int startInclusive, int endInclusive) method does the same with only
         * one difference – the second element is included. These two methods can be used to generate
         * any of the three types of streams of primitives.
         * */

        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.rangeClosed(1, 10);

        intStream.forEach(System.out::println);
        System.out.println();
        longStream.forEach(System.out::println);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        doubleStream.boxed().forEach(System.out::println);

        "kjhjhkjh".chars().forEach(System.out::println);

        Stream<String> streamOfString =
                Pattern.compile(",").splitAsStream("a, b, c");

        streamOfString.forEach(System.out::println);


    }



}
