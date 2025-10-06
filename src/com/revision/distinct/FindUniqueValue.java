package com.revision.distinct;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUniqueValue {

	public static void main(String[] args) {
		String str ="4512587458524";
		
		String result = Stream.of(str.split(""))
		.distinct().collect(Collectors.joining(""));
		System.out.println("Result : "+result);
		
		
	} 
	
}
