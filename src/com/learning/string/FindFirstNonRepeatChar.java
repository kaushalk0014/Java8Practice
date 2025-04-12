package com.learning.string;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to find first non repeat element from a given string
 */
public class FindFirstNonRepeatChar {

	public static void main(String[] args) {
		
		String str="IloveJavaProgram";
		
		String result=Stream.of(str.split(""))
		.collect(Collectors.groupingBy(n->n.toLowerCase(),LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream()
		.filter(m->m.getValue()==1)
		//.filter(m->m.getValue()>1)
		.findFirst().get().getKey();
		
		System.out.println(result);
	}

}
