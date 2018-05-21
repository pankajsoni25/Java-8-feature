package com.stream.IntegerStram;

import java.util.stream.IntStream;

public class IntStreamWithSkip {

    public static void main(String[] args) {

        // 2. Integer Stream with skip

        IntStream.range(1,10)
                // will skip first 5 element of the Stream
                .skip(5).forEach(System.out::println);
        System.out.println();


    }


}
