package com.learning.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateValueOnly {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Spring");
		list.add("Hibernate");
		list.add("Java");
		list.add("React");
		list.add("Java");
		list.add("Angular");
		list.add("Splunk");
		list.add("Splunk");
		list.add("JavaScript");
		list.add("Hibernate");
		
		
		list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v)-> System.out.println("Key : "+ k +",   Value : "+v));
		
		System.out.println("================================================");
		Map<String, Long> frequencyMap = list.stream()
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> duplicate=frequencyMap
		.entrySet().stream()
		//.peek(System.out::println)
		.filter(m->m.getValue()>1)
		//.peek(System.out::println)
		.map(Map.Entry::getKey).collect(Collectors.toList());
	
		System.out.println(duplicate);
	}
}

