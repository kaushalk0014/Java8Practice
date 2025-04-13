package com.learning.number;

import java.util.Arrays;

public class FindSecondLowestNumber {

	/*
	 * Find the second lowest number
	 */

	public static void main(String[] args) {
		int arr[] = { 54, 8, 1, 2, 9, 5, 7 };
		
		Integer result=Arrays.stream(arr).boxed().sorted()
		.skip(1)
		.findFirst().get();
		
		System.out.println(result);
	}
}
