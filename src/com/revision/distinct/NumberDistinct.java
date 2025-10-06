package com.revision.distinct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberDistinct {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 45, 12, 78, 45, 25, 66, 99, 44, 22, 66, 99);

		List<Integer> result = list.stream().distinct().collect(Collectors.toList());

		System.out.println("Result : " + result);
		
		/*
		 * remove duplicates from a list of integers and sort them in ascending order
		 * using Java 8
		 */
		System.out.println("----- Ascending order--------");
		
		List<Integer> ascendingOrder =
		list.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		System.out.println(ascendingOrder);
		
		/*
		 * remove duplicates from a list of integers and sort them in descending order
		 * using Java 8
		 */
		System.out.println("----- Descending order--------");
		
		List<Integer> descendingOrder =
		list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(descendingOrder);
	}
}
