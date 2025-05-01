package com.learning.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		 List<String> input = Arrays.asList("cat", "tac", "act", "dog", "god");
		 
		 Collection<List<String>> groupedAnagrams=
		 input.stream()
		 .collect(Collectors.groupingBy(word->sortChars(word), LinkedHashMap::new, Collectors.toList()))
		 .values();
		 
		 System.out.println(groupedAnagrams);
	}

	private static String sortChars(String word) {
	//	System.out.println(word);
		char ch[] = word.toCharArray();
		 Arrays.sort(ch);
		 System.out.println(new String(ch));
		return new String(ch);
	}
}
