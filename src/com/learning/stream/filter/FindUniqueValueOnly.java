package com.learning.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueValueOnly {

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
		
		List<String> result =list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(m-> m.getValue()<2).map(Map.Entry::getKey).collect(Collectors.toList());
	
		System.out.println(result);
	}
}
