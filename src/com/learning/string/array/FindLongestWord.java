package com.learning.string.array;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestWord {

	public static void main(String[] args) {
		String arr[] = { "bananna", "orrange", "watermelon", "blueberry", "apple", "gua," };

		String longestWord = Stream.of(arr).collect(Collectors.toMap(Function.identity(), map -> map.length()))
				.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).findFirst()
				.map(Map.Entry::getKey).get();

		System.out.println(longestWord);
		System.out.println("------------------------------------");
		System.out.println(findLongestWord(arr));
	}
	
	private static String findLongestWord(String[] arr) {
		
		return Stream.of(arr)
		.reduce((a,b)-> a.length()>b.length()?a:b).get();
		 
	} 
}
