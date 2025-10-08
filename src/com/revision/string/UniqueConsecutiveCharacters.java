package com.revision.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueConsecutiveCharacters {

	public static void main(String[] args) {
		 String str = "886644221";
		 
		 String result = 
		 IntStream.range(0, str.length())
		 .filter(i-> i == 0 || str.charAt(i) != str.charAt(i-1))
		 .mapToObj(i-> String.valueOf(str.charAt(i)))
		 .collect(Collectors.joining());
		 
		 
		 System.out.println("Result : "+ result);
	}
}
