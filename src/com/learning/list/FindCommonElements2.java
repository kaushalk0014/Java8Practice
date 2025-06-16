package com.learning.list;

import java.util.HashSet;
import java.util.List;

public class FindCommonElements2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 4, 3, 5, 6);
		
		List<Integer> list2 = List.of(7, 9, 2, 3, 5);
		
		List<Integer> result = list.stream()
		.filter(new HashSet(list2)::contains)
		.toList();
		
		System.out.println("Result : "+result);
		
	}
}
