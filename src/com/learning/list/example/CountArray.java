package com.learning.list.example;

import java.util.Arrays;
import java.util.List;

public class CountArray {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(40,63,29,55,45,28,53,74,22);
		
		long count=list.stream().count();
		System.out.println(count);
	}
}
