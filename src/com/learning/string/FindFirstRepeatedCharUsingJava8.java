package com.learning.string;

import java.lang.foreign.Linker.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class FindFirstRepeatedCharUsingJava8 {

	public static void main(String[] args) {
		String str = "I am an Indian".toLowerCase().replace(" ", "");

		Set<String> set = new HashSet<String>();

		Optional<String> result = Stream.of(str.split("")).filter(s -> !set.add(s)).findFirst();

		if (result.isPresent()) {
			System.out.println("First repeated character: " + result.get());
		}
		findDirstRepeatedChar(str);
	}

	private static void findDirstRepeatedChar(String str) {
		Set<Character> set = new HashSet<Character>();

		Optional<Character> result = str.toLowerCase().chars().filter(s -> s != ' ').mapToObj(ch -> (char) ch)
				.filter(m -> !set.add(m)).findFirst();

		if (result.isPresent()) {

			System.out.println("First repeated character using java 8 : " + result.get());
		}
	}
}
