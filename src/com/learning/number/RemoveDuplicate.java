package com.learning.number;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "11423123654";
		
		String result=Stream.of(input.split(""))
		.distinct().collect(Collectors.joining());
		
		System.out.println("Result : "+ result);
	}
}
