package com.example.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWord {
	
	public static void main(String[] args) {
		  String text = "Java is great and Java is powerful and Java is fun";
		  
		  Map<String, Long> result=Arrays.asList(text)
		  .stream()
		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		  
		  System.out.println("Result :");
		  System.out.println(result);
	}
}
