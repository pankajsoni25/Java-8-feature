package com.stream.IntegerStram;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {

        Stream
                .of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


    }


}
