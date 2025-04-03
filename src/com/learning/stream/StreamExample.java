package com.learning.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
        Stream<String> stream = List.of("apple", "banana", "cherry")
                .stream()
                .map(s -> {
                    System.out.println("Mapping: " + s);
                    return s.toUpperCase();
                });

        System.out.println("Stream created, but map() not executed yet!");

        // Now execute a terminal operation
        stream.forEach(System.out::println);
    }
}
