package com.example.nth.salary;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pankaj", 2500);
		map.put("Rakesh", 1600);
		map.put("Anil", 1500);
		map.put("Dinesh", 1400);
		map.put("Rajesh", 440);
		
		Map.Entry<String, Integer> resultData= map.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			.collect(Collectors.toList())
			.get(1);
		
		System.out.println(resultData);
	}
}
