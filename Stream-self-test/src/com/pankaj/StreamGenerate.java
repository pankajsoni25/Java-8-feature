package com.pankaj;

import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class StreamGenerate {

    public static void main(String[] args) {
        /**
         * The generate() method accepts a Supplier<T> for element generation. As the resulting
         * stream is infinite, developer should specify the desired size or the generate() method
         * will work until it reaches the memory limit:
         * */

        /*The code above creates a sequence of ten strings with the value – “element”.*/
        Stream stream = Stream.generate(()->"element").limit(10);
        stream.forEach(System.out::println);



    }


}
