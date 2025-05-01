package com.learning.string;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

	public static void main(String[] args) {
		String input = "Java is awesome";

		String result = Stream.of(input.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return String.join(" ", list);
		}));
		
		System.out.println(result);
	}
}
