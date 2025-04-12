package com.learning.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEachCharacter {
	/*
	 * Write a program to find count the occurrence of each character
	 */
	
	public static void main(String[] args) {
		String str="ilovejava";
		
		Stream.of(str.split("")).collect(Collectors.groupingBy(ch->ch))
		.forEach((k,v)->{
			System.out.println("Key : "+ k +"  Value : "+ v);
		});
		
		System.out.println("----------------------------");
		
		Map<String, Long> map=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
		String  strArr[]=str.split("");
		
		
		Map<String, Integer> result = new HashMap<>();
		for (String ch : strArr) {
		    result.put(ch, result.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println("---------------------");
		System.out.println(result);
		
		
	}
}
