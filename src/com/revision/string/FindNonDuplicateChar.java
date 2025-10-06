package com.revision.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNonDuplicateChar {
	
	public static void main(String[] args) {
		String str = "I am am learning java java";
		
		str = str.toLowerCase().replace(" ", "");
		
		
		Map<String, Long> map = Stream.of(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(m-> m.getValue()<2)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map);
	
	}
}
