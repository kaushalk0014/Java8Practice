package com.learning.string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUniqueCharacters {

	public static void main(String[] args) {
		String str="apple";
		 System.out.println("Result : "+ findUniqueValue(str));
	}

	private static String findUniqueValue(String str) {

		str = str.toLowerCase();

		Map<String, Long> map = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		
		List<String> result=map.entrySet().stream().filter(m->m.getValue()<2).map(Map.Entry::getKey).toList();
		
		return result.stream().collect(Collectors.joining());
	}
}
