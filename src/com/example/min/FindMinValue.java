package com.example.min;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinValue {

	public static void main(String[] args) {
		List<Integer> list = Stream
				.iterate(12, num -> num + 1)
				.limit(20)
				.collect(Collectors.toList());

		System.out.println("List is : " + list);

		// Find min value

		Integer min = list.stream()
				.min(Integer::compareTo)
				.get();
		System.out.println("\n Approach 1 to find Min value : " + min);

		Integer min2 = Collections.min(list);

		System.out.println("\n Approach 2 to find Min value : " + min2);

		Integer min3 = list.stream().reduce((num1, num2) -> num1 < num2 ? num1 : num2).get();
		
		System.out.println("\n Approach 3 to find Min value : " + min3);
		
		Integer min4 = list.stream().mapToInt(num->num).min().getAsInt();
		System.out.println("\n Approach 4 to find Min value : " + min4);
		
		Integer min5 = list.stream().mapToInt(num->num).min().orElseThrow();
		System.out.println("\n Approach 5 to find Min value : " + min5);
		
		Integer min6=list.stream().reduce(Integer.MAX_VALUE, Integer::min);
		
		System.out.println("\n Approach 6 to find Min value : " + min6);
		
		Integer min7 = list.stream()
		.collect(Collectors.collectingAndThen(Collectors.minBy(Integer::compareTo),
				Optional::get));
		
		System.out.println("\n Approach 7 to find Min value : " + min7);
	}
}
