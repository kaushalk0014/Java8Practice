package com.learning.list.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestRepeatedCharacter {

	public static void main(String[] args) {
		  String str = "engineer";
		  
		  str=str.toLowerCase();
		  
		   Optional<String> retult=Stream.of(str.split(""))
		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		  .entrySet().stream()
		  .max(Map.Entry.comparingByValue())
		  .map(Map.Entry::getKey);
		   
		   System.out.println(retult);
	}
}
