package com.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileRowsFilter {

    public static void main(String[] args) throws IOException {

        // 8. Stream rows from text file, sort, filter, and print
        Stream<String> lines = Files.lines(Paths.get("FiterMapReduce/bands.txt"));
        lines.sorted()
                .filter(x->x.length()>13)
                .forEach(System.out::println);
        lines.close();
    }
}
