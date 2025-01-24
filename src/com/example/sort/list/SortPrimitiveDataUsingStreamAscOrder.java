package com.example.sort.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPrimitiveDataUsingStreamAscOrder {

	public static void main(String[] args) {

		List<Integer> list = getListValue();

		list.stream().sorted().forEach(System.out::print);
		// or
		list.stream().sorted().forEach(num -> System.out.println("Ascending order : " + num));
		// or

		List<Integer> sortValue = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order sort data : " + sortValue);

		list.stream().sorted(Comparator.naturalOrder())
				.forEach(num -> System.out.println("Ascending order Comparator.naturalOrder() : " + num));

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		
		System.out.println("------Using Comparator method implimentation------");
		list.stream().sorted(comparator)
				.forEach(num -> System.out.println("Ascending order Comparator.naturalOrder() : " + num));
		
		System.out.println("------------------------");
		
		list.stream().sorted( (num1,num2)->num1-num2)
		.forEach(num -> System.out.println("Ascending order using lambda : " + num));

	}

	private static List<Integer> getListValue() {
		return Arrays.asList(10, 8, 6, 9, 16, 13, 18, 17);
	}
}
