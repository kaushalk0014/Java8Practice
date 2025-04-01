package com.example.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWord {

	public static void main(String[] args) {
		String text = "Java is great and Java is powerful and Java is fun";
		useingMap(text.split("\s"));
		
		//using java 8
		
		Map<String, Long> map=Arrays.asList(text.split("\s")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}

	private static void useingMap(String[] arr) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : arr) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		System.out.println(map);
	}
}
