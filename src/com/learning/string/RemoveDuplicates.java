package com.learning.string;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 String str = "125577";
		// Output: 1257
		 
		 Set<String> set = new LinkedHashSet<String>();
		 
		 String result = Stream.of(str.split("")).filter(set::add)
		 .collect(Collectors.joining(""));
		 
		 System.out.println("Result : "+result);
	}
}
