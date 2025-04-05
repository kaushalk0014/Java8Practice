package com.learning.printmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintMap {

	public static void main(String[] args) {

		String str = "Framework";
		Map<Character, Long> map = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		approach1(map);
		approach2(map);

	}

	private static void approach1(Map<Character, Long> map) {
		System.out.println("Approach 1 :");
		map.entrySet().forEach(PrintMap::printData);

	}

	private static void approach2(Map<Character, Long> map) {
		map.forEach((k, v) -> {
			System.out.println("Key : " + k + "          Value : " + v);
		});
	}

	private static void printData(Map.Entry<Character, Long> entry) {
		System.out.println("Key : " + entry.getKey() + "          Value : " + entry.getValue());
	}
}
