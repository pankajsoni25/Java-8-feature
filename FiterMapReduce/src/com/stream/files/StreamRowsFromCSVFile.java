package com.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamRowsFromCSVFile {


    // 11 : Stream rows from CSV file and parseInt and print
    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get("FiterMapReduce/data.txt"));
        long count = stream.map(x -> x.split(",")).filter(x -> x.length == 3).count();
        System.out.printf("count : %s", count);
        stream.close();

    }


}
