package com.stream.reduction;

import java.util.stream.Stream;

public class StreamReduction {

    // 13. Reduction - sum
    public static void main(String[] args) {
        double total = Stream.of(7.3,1.5,4.5)
                .reduce(0.0,(Double a,Double b)->a+b);
        System.out.println(total);
    }

}

