package com.learning.number;

import java.util.stream.Stream;

public class SumOfAllDigits {
	public static void main(String[] args) {
		int input = 141231;
		
		int result =Stream.of(String.valueOf(input).split(""))
		.mapToInt(Integer::parseInt).sum();
		
		System.out.println("Result : "+ result);
	}
}
