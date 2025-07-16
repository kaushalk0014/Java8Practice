package com.learning.distinct;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUniqueValue {

	public static void main(String[] args) {
		String str="125577"; //1257
		
		String result = Stream.of(str.split("")).distinct().collect(Collectors.joining(""));
		
		System.out.println("Result : "+ result);
		
		
		System.out.println("A".repeat(5));
	}
}
