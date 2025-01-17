package com.sort.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPrimitiveDataUsingStreamDesOrder {

	public static void main(String[] args) {

		List<Integer> list = getListValue();

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		// or
		System.out.println("\n");
		list.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println("Descending order : " + num));
		// or

		List<Integer> sortValue = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending order sort data : " + sortValue);

		list.stream().sorted(Comparator.reverseOrder())
				.forEach(num -> System.out.println("Descending order Comparator.naturalOrder() : " + num));

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		
		System.out.println("------Using Comparator method implimentation------");
		list.stream().sorted(comparator)
				.forEach(num -> System.out.println("Descending order : " + num));
		
		System.out.println("------------------------");
		
		list.stream().sorted( (num1,num2)->num2-num1)
		.forEach(num -> System.out.println("Descending order using lambda : " + num));

	}

	private static List<Integer> getListValue() {
		return Arrays.asList(10, 8, 6, 9, 16, 13, 18, 17);
	}
}
