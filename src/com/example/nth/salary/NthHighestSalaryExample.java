package com.example.nth.salary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthHighestSalaryExample {

	public static void main(String[] args) {

		Map.Entry<String, Integer> resultData = getMap().entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);

		System.out.println(resultData);

		System.out.println("Approach 2: " + nthHighestSalary(2, getMap()));
		System.out.println("Approach 3: " + nthHighestSalary3(2, getMap()));
		System.out.println("Approach 4: " + nthHighestSalary4(1, getMap2()));
	}

	public static Entry<String, Integer> nthHighestSalary(int index, Map<String, Integer> map) {
		
		return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList()).get(index-1);

	}

	public static Entry<String, Integer> nthHighestSalary3(int index, Map<String, Integer> map) {

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		return list.get(index-1);

	}
	
	public static Entry<Integer, List<String>> nthHighestSalary4(int index, Map<String, Integer> map) {
		
		 return map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, 
				Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet()
				.stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(index);
		
		  
	}

	public static Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pankaj", 1500);
		map.put("Rakesh", 1600);
		map.put("Anil", 1200);
		map.put("Dinesh", 1400);
		map.put("Rajesh", 1700);

		return map;
	}
	
	public static Map<String, Integer> getMap2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pankaj", 1500);
		map.put("Rakesh", 1500);
		map.put("Anil", 1200);
		map.put("Dinesh", 1200);
		map.put("Rajesh", 1600);

		return map;
	}
}
