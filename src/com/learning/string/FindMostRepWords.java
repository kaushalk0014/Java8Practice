package com.learning.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostRepWords {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		
		
		String result =listOfStrings.stream()
		.collect(Collectors.groupingBy(word->word, Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.get();
		
		System.out.println("Result : "+ result);
	}
}
