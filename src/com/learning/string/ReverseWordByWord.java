package com.learning.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		
		String result =Stream.of(str.split(" "))
		.map(data-> new StringBuffer(data).reverse().toString())
		.collect(Collectors.joining(" "));
		
		
		System.out.println("Result : "+ result);
	}
}
