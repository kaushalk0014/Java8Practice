package com.learning.string;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
		String str = "I am an Indian";

		String result = Stream.of(str.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return String.join(" ", list);
		}));
		
		System.out.println(result);
	}
}
