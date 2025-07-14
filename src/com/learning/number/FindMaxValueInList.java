package com.learning.number;

import java.util.Comparator;
import java.util.List;

public class FindMaxValueInList {

	public static void main(String[] args) {
		List<Integer> listNumber= List.of(1,2,7,8,6,4,2,5,88,44,66);
		
		Integer maxNumber=
		listNumber.stream()
		.sorted(Comparator
		.reverseOrder())
		.skip(1).findFirst().get();
		
		System.out.println("Result : "+maxNumber );
	}
}
