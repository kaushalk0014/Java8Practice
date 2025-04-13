package com.learning.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhoSartFrom1 {

	/*
	 * Write a program who start from 1
	 */

	public static void main(String[] args) {
		int arr[] = {5,4,11,22,56,74,15, 1};
		
		List<String> list=Arrays.stream(arr).boxed()
		.map(s-> s+"")
		.filter(f-> f.startsWith("2"))
		.collect(Collectors.toList());
	
		System.out.println(list);
	}
}
