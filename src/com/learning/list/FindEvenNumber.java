package com.learning.list;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,45,48,46,5,89,42,75,66);
		
		List<Integer> filterResult=list.stream().filter(num-> num%2==0).toList();
		System.out.println(filterResult);
	}
}
