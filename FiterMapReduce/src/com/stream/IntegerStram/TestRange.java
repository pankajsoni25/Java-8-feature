package com.stream.IntegerStram;

import java.util.stream.IntStream;

public class TestRange {


    public static void main(String[] args) {

        // 1. Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::print);
        System.out.println();
    }


}
