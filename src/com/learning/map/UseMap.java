package com.learning.map;

import java.util.Arrays;
import java.util.List;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Multiply by two for each element from the list
		 */
		
		List<Integer> list= Arrays.asList(1,2,5,6,8,4,9,3);
		
		List<Integer> resultMap=list.stream().map(num-> num*2).toList();
		
		System.out.println(resultMap);
	}
}
