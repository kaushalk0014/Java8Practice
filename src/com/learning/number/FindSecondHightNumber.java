package com.learning.number;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHightNumber {
	/*
	 * Find second highest number from given array
	 * 
	 */
	
	
	public static void main(String[] args) {
		int arr[]= {45,12,65,89, 89,17,45,12};
		
		Integer list=Arrays.stream(arr).boxed()
		.sorted(Comparator.reverseOrder()).distinct()
		.skip(1)
		.findFirst().get();
		 
		
		System.out.println(list);
		System.out.println("------------------------------");
	}
}
