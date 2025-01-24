package com.example.bifunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		// return Stream.of(list1, list2).flatMap(List::stream).distinct().toList();
		return Stream.of(list1, list2).flatMap(listNum -> listNum.stream()).distinct().toList();
	}

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 4, 3, 6, 9, 12, 14);
		List<Integer> list2 = Arrays.asList(2, 5, 3, 8, 10, 12, 16);

		// Remove duplicate from list
		BiFunctionExample biFunctionExample = new BiFunctionExample();
		System.out.println(biFunctionExample.apply(list1, list2));

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pankaj", 18000);
		map.put("Ranjan", 20000);

		map.replaceAll((k, v) -> v + 1000);

		System.out.println(map);
	}

}
