package com.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamRowsFromCSVFileAndParseInt {

    // 10 : Stream rows from CSV file and parseInt and print
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("FiterMapReduce/data.txt"));
        lines.map(x->x.split(","))
                .filter(x -> x.length==3)
                .filter(x -> Integer.parseInt(x[1])> 15)
                .forEach(out-> {
                    System.out.printf("{ X[0] : %s , X[1] : %s , X[2] : %s }", out[0], out[1], out[2] );
                    System.out.println();
                });
        lines.close();
    }

}
