package com.learning.list;

import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,4,3,5,6 );
		List<Integer> list2=List.of(7,9,2,3,5);
		
		
		List<Integer> result  = list.stream()
		.filter(list2::contains)
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
