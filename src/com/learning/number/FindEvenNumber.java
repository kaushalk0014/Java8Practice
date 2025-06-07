package com.learning.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(2, 5, 4, 1, 3, 6);
		
		List<Integer> result= Stream.concat(input.stream().filter(num-> num%2==0).sorted(), 
				input.stream().filter(num-> num%2!=0).sorted()).collect(Collectors.toList());
		
		System.out.println(result);
	}
}
