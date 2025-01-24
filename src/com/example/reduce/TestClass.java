package com.example.reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {


	public static void main(String[] args) {
		// find big number in given list
		List<Integer> nums=getList();
		
		int sumValue=0;
		
		for(Integer num:nums) {
			sumValue=sumValue+num;
		}
		
		System.out.println("Sum all value : "+ sumValue);
		
		Integer maxValue = getList().stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println("Max value :"+maxValue);

		Integer minValue = getList().stream().reduce((a, b) -> a > b ? b : a).get();
		System.out.println("Min value : " + minValue);
		
		Integer sumList = getList().stream().reduce((a, b) -> a+b).get();
		System.out.println("Sum number : " + sumList);

	}

	private static List<Integer> getList() {
		return Stream.of(10, 20, 60, 40, 80, 90, 100, 50).collect(Collectors.toList());
	}
}
