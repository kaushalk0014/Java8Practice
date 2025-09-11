package com.revision.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestWord {

	public static void main(String[] args) {
		String arr[] = { "bananna", "orrange", "watermelon", "blueberry", "apple", "gua", "banana", "kiwi", "strawberry" };
		
		String longestWord = Stream.of(arr).collect(Collectors.toMap(Function.identity(), map->map.length()))
		.entrySet().stream().sorted((o1,o2)->o2.getValue().compareTo(o1.getValue())).findFirst()
		.map(Map.Entry::getKey).get();
	
		
		System.out.println("Longest word : "+longestWord);
		
		System.out.println("Longest Word 2 : "+ findLongestW(Stream.of(arr)) );
		
	}
	
	private static String findLongestW(Stream<String> stream) {
		return stream.reduce((a, b) -> a.length()>b.length()?a:b).get();
	}
}
