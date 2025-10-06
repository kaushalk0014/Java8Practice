package com.revision.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameDistinct {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Akash", "Kaushal", "Akash", "Shankar", "Rakesh", "Pankaj", "Pankaj");
		
		List<String> result = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Result : "+ result);
		
	}
}
