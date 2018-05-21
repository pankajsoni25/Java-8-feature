package com.stream.IntegerStram;

import java.util.Arrays;

public class StreamArrayAverageOfSquare {

    public static void main(String[] args) {
        // 6. average of square of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

    }

}
