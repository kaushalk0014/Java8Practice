package com.revision.string;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedChar2 {

	public static void main(String[] args) {
		String str = "Java is a programming language";

		str = str.toLowerCase().replace(" ", "");
		
		String duplicateValue = Stream.of(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()))
		.entrySet().stream().filter(m->m.getValue()>1).findFirst().get().getKey();

		System.out.println(duplicateValue);
	}
}
