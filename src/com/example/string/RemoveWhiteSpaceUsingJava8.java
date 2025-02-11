package com.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveWhiteSpaceUsingJava8 {

	public static void main(String[] args) {
		String str = " M y n a me ka u s h a l";

		// Trim spaces at the beginning and end of the string
		// System.out.println("Trimmed String: " + str.trim());

		System.out.println("String length : " + str.length());
		System.out.println("String array size : " + str.split("").length);

		//step 1
		Stream<String> stream = Stream.of(str.split(""));

		stream.forEach(System.out::print);
		
		System.out.println("\n --------- step 2 --------------");
		List<String> listStr=Arrays.stream(str.split("")).filter(c->!c.equals(" "))
		.collect(Collectors.toList());
		
		System.out.println(listStr);
		System.out.println("\n --------- step 3 --------------");
		
			
		String removeSpace =Arrays.stream(str.split(""))
		.filter(s->!s.equals(" "))
		.reduce("", (s,c)-> s+c);
		
		
		System.out.println("\n  Replace String value : " + removeSpace);
		
		System.out.println("\n=================================");
		String removeSpace2 = Arrays.stream(str.split(""))
				.peek(System.out::println)
				.filter(c -> !c.equals(" "))
				.peek(System.out::println)
				.reduce("", (s, c) -> s + c);

		System.out.println("\n  Replace String value : " + removeSpace2);
	}
}
