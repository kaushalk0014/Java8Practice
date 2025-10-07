package com.learning.string;

import java.awt.geom.QuadCurve2D;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueCharsInTwoStr {

	public static void main(String[] args) {
		String str1= "apple";
		String str2 = "banana";
		 
		// o/p = [b,e,l,n,p]
		
		Set<String> set1= Stream.of(str1.split("")).collect(Collectors.toSet());
		Set<String> set2= Stream.of(str2.split("")).collect(Collectors.toSet());
		
		Set<String> unque1= new HashSet<String>(set1);
		
		Set<String> unque2= new HashSet<String>(set2);
		
		unque1.removeAll(set2);
		
		unque2.removeAll(set1);
		
		Set<String> result= new TreeSet<String>();
		result.addAll(unque1);
		result.addAll(unque2);
		
		System.out.println(result);//[b, e, l, n, p]
		
		System.out.println("------------using stream------------------");
		
		String combinedStr = str1 + str2;
		
		Map<Character, Long> freqMap = combinedStr.chars()
			    .mapToObj(c -> (char) c)
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


		List<Character> result2 = freqMap.entrySet().stream()
			    .filter(e -> e.getValue() == 1)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toList());

		System.out.println(result2); //[b, e, l]
		
		System.out.println("------------using stream----222--------------");
		
		Map<String , Long> map =
				Stream.of(combinedStr.toLowerCase().split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<String> uniqueKey = 
		map.entrySet().stream().filter(m-> m.getValue()==1)
		.map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(uniqueKey);//[b, e, l]
	}
}
