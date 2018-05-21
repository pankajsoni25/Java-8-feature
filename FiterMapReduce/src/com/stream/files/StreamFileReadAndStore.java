package com.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFileReadAndStore {

    public static void main(String[] args) throws IOException {

        // 9. Stream rows from text file and save to list
        List<String> bands = Files.lines(Paths.get("FiterMapReduce/bands.txt"))
                .filter(x->x.contains("dsg"))
                .collect(Collectors.toList());
        bands.forEach(System.out::println);

    }



}
