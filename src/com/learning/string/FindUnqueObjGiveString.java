package com.learning.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUnqueObjGiveString {

	public static void main(String[] args) {
		/*
		 * Find unique object in given string
		 */
		
		String str ="iloveprogramming";
		
		List<String> list=
		Stream.of(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter(s->s.getValue()==1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		
		System.out.println(list);
	}
}
