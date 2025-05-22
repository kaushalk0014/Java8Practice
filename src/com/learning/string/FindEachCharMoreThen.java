package com.learning.string;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEachCharMoreThen {

	/*
	 * Find all duplicate in given string
	 * 
	 */

	public static void main(String[] args) {
		
		String str="ilovejavaAndSpring";
		
		Map<String, Long> map= Stream.of(str.split(""))
		.collect(Collectors.groupingBy(ch-> ch.toLowerCase(),TreeMap::new ,Collectors.counting()));
		
		System.out.println(map);
		
		System.out.println("-------------------------------");
		
		List<String> list=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(m->m.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		/*
		 * to avoid case sensitive we should use below code 
		 */
		
		List<String> listResult=Stream.of(str.split(""))
				.collect(Collectors.groupingBy(s->s.toLowerCase(), Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1)
		.map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(listResult);
		
		System.out.println("--------------------------");
		/*
		 * If we want to sort it then we will use below code
		 */
		
		
		List<String> sortList=Stream.of(str.split(""))
		.collect(Collectors
				.groupingBy(s->s.toLowerCase(), TreeMap::new, 
						Collectors.counting()))
		.entrySet().stream().filter(m->m.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(sortList);
	}
}
