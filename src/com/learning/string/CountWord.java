package com.learning.string;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWord {

	public static void main(String[] args) {

		String str="Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.";
		
		str=str.replaceAll("\\.", "");
		str=str.toLowerCase();
		Stream<Entry<String, Long>> result=
		Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),
			 LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.sorted( Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()));
		
		System.out.println(result);
		System.out.println("-------------------");
		
		Map<String, Long> resultMap=Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),
				 LinkedHashMap::new, Collectors.counting()))
			.entrySet()
			.stream()
			.sorted( Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
		
		System.out.println(resultMap);
		
		 
		
	
	}
}
