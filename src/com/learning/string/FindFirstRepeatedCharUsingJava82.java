package com.learning.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedCharUsingJava82 {

	public static void main(String[] args) {
		String str = "I am an Indian".toLowerCase().replace(" ", "");
		
		String result=Stream.of(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(m-> m.getValue()>1).map(Map.Entry::getKey).findFirst().get();
		
		System.out.println("Result : "+ result);
		
		approach2(str);
	}

	private static void approach2(String str) {
		System.out.println("Approach 2");
		Set<String> set=new HashSet<String>();
		
		String result=Stream.of(str.split(""))
		.filter(s-> !set.add(s)).findFirst().get();
		
		System.out.println(result);
		
	}
}
