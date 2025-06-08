package com.learning.list.map;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonrepeatedChar {

	public static void main(String[] args) {
		 String str = "engineer";
		 str= str.toLowerCase();
	
		 String result=Stream.of(str.split(""))
		 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 .entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
		 
		 System.out.println("Result : "+ result);
		 
	}
}
