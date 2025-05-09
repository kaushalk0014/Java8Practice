package com.learning.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacters1 {

	public static void main(String[] args) {
		String str ="I am an India";
		
		str=str.replace(" ", "").toLowerCase();
		
		List<String> result =
				Stream.of(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(map-> map.getValue()>1)
				 .map(Map.Entry::getKey).collect(Collectors.toList());
				 
		
		System.out.println(result);
				
	 }
}
