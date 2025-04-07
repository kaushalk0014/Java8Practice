package com.learning.stream.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Spring");
		list.add("Hibernate");
		list.add("Java");
		list.add("React");
		list.add("Angular");
		list.add("Splunk");
		list.add("JavaScript");

		approach1(list);
		approach2(list);
		approach3(list);
		approach4();

	}

	private static void approach1(List<String> list) {
		// Basic approach for filtering data
		System.out.println("Approach 1");
		for (String str : list) {
			if (str.startsWith("S")) {
				System.out.println("Result : " + str);
			}
		}
	}

	private static void approach2(List<String> list) {
		System.out.println("\nApproach 2");
		// Filter method is internally using Predicate
		Predicate<String> presicate = str -> str.startsWith("J");

		list.stream().filter(presicate).forEach(str -> System.out.println("Result : " + str));
	}

	private static void approach3(List<String> list) {
		System.out.println("\nApproach 3");

		list.stream().filter(str -> str.startsWith("S")).forEach(str -> System.out.println("Result : " + str));

	}

	private static void approach4() {
		System.out.println("\nApproach 4 add filter on map");
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Spring");
		map.put(102, "Hibernate");
		map.put(103, "React");
		map.put(104, "Java");

		map.entrySet().stream()
		.filter(data-> data.getKey()==101)
		.forEach(obj->System.out.println(obj));
	
	}
}
