package com.stream.reduction;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummeryStatistics {

    public static void main(String[] args) {

        IntSummaryStatistics summaryStatistics = IntStream.of(7,2,19,88,73,4,10)
            .summaryStatistics();
        System.out.println(summaryStatistics);

    }

}
