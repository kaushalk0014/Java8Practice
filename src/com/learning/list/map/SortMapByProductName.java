package com.learning.list.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByProductName {
	public static void main(String[] args) {
		Map<Integer, Product> map = new HashMap<>();
		map.put(101, new Product(101, "Laptop", 80000d));
		map.put(102, new Product(102, "Phone", 50000d));
		map.put(103, new Product(103, "Book", 3000d));
		
		Map<Integer, Product> sortedMap = map.entrySet()
				.stream().sorted((p1, p2)-> p1.getValue().getName().compareTo(p2.getValue().getName()))
		.collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue,
				(e1,e2)->e1,
				LinkedHashMap::new
				));
		
		System.out.println(sortedMap);
	}
}
