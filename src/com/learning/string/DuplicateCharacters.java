package com.learning.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input = "programming";
		
		Map<String, Long> result =Stream.of(input.toLowerCase().split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream()
		.filter(m-> m.getValue()>1)
		 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		
		result.forEach((k, v)->{
			System.out.println("key : "+ k+ ",   Value : "+v);
		});
		
		String str="madam";
		
		boolean isPalindromic=IntStream.range(0, str.length()/2)
		.allMatch(i-> str.charAt(i)== str.charAt(str.length()-1-i));
		
		System.out.println(isPalindromic);
		
	}
}
