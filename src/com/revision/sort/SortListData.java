package com.revision.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortListData {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kaushal", null, "Rakesh", "Pankaj", "Mohan");
		
		//Collections.sort(list);
		//If We are using Collections.sort then it will give null pointer exception
		
		list.sort(Comparator.nullsLast(String::compareToIgnoreCase));

		System.out.println(list);
		
		System.out.println("------Using stream--------");
		// using stream
		
		List<String> listData = Arrays.asList("Akash", "Kaushal", null, "Shankar", "Rakesh", "Pankaj", "Mohan");
		
		listData.stream().filter(Objects::nonNull).sorted().forEach(System.out::println);
		
		System.out.println("-------Using comparable");
		
		listData.stream()
		.filter(Objects::nonNull)
		.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("-------Using comparable");
		
		
		listData.stream()
		.filter(Objects:: nonNull)
		.sorted((o1, o2)->o1.compareTo(o2)).forEach(System.out::println);
	}
}
