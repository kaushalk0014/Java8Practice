package com.learning.string;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueCharsInTwoStr {

	public static void main(String[] args) {
		String str1= "apple";
		String str2 = "banana";
		 
		// o/p = [b,e,l,n,p]
		
		Set<String> set1= Stream.of(str1.split("")).collect(Collectors.toSet());
		Set<String> set2= Stream.of(str2.split("")).collect(Collectors.toSet());
		
		Set<String> unque1= new HashSet<String>(set1);
		
		Set<String> unque2= new HashSet<String>(set2);
		
		unque1.removeAll(set2);
		
		unque2.removeAll(set1);
		
		Set<String> result= new TreeSet<String>();
		result.addAll(unque1);
		result.addAll(unque2);
		
		System.out.println(result);
		
	}
}
