package com.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRowsFromCSVFileStoreInHashMap {

    // 12 : Stream rows from CSV   and store in HashMap
    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("FiterMapReduce/data.txt"));
        Map<String,Integer> map = new HashMap<>();
        map = lines.map(x-> x.split(","))
                .filter(x->x.length==3)
                .filter(x-> Integer.parseInt(x[1])>15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt( x[1] )
                ));
        lines.close();
        for (String s : map.keySet()) {
            System.out.println(" key : "+s+ " value : "+map.get(s));
        }


    }



}
