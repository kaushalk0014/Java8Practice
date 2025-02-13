package com.example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsMethod {

	public static void main(String[] args) {

		// Collections.frequency(list, 6);
		// find occurrence of each element in given list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 4, 6, 5, 6, 1, 3, 8, 9, 4, 6);

		int count = Collections.frequency(numbers, 3);
		System.out.println("Occurrence of Time 3 : " + count);
		System.out.println("\n");
		// using map we can also find occurrence of each element
		Map<Integer, Integer> map = new HashMap<>();
		numbers.stream().forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));

		System.out.println(map);

		int occurrence = map.entrySet().stream().filter(num -> num.getValue() == 1).map(Map.Entry::getKey).findFirst()
				.orElse(null);

		System.out.println("Occurrence of 1 Time : " + occurrence);

		System.out.println("\n");
		// Collections.disJoint

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 8, 6, 9);
		List<Integer> list2 = Arrays.asList(3, 4, 8, 6, 9);

		boolean isCommonListSomeValue = Collections.disjoint(list1, list2);

		if (isCommonListSomeValue) {
			System.out.println("This list have no common element");
		} else {
			System.out.println("This list haveing common element");
		}

		System.out.println("\n");
		// Collections.singleton
		Set<String> singletonObj = Collections.singleton("java");

		try {
			singletonObj.add("sql");
		} catch (Exception e) {
			System.out.println("Set is a immutable, It can't be modify");
		}

		System.out.println("\n");

		// Collections.rotate()

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Collections.rotate(list, 4);// It will rotate right side positive value
		Collections.rotate(list, -4);// It will rotate left side if negative value

		System.out.println("Rotate List : " + list);

		// nCopies is a immutable, It can't to modify
		List<String> listNCopies = Collections.nCopies(6, "spring");
		System.out.println(listNCopies);
		try {
			listNCopies.add("Java");
		} catch (Exception e) {
			System.out.println("List is a immutable, It can't be modify");
		}
		System.out.println("\n");
	}
}
