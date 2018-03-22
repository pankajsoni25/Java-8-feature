package com.pankaj;

import java.util.stream.Stream;

/**
 * @author pankaj
 */
public class StreamBuilder {

    public static void main(String[] args) {

        /**
         * When builder is used the desired type should be additionally specified in the right part
         * of the statement, otherwise the build() method will create an instance of the
         * Stream<Object>:
         * */

        Stream integerStream = Stream.builder().add("gdsg").add("dxfdsz").build();
        integerStream.forEach(System.out::println);

    }
}
