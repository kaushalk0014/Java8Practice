package com.learning.string;

import java.util.Arrays;
import java.util.List;

public class StringJoin {

	/*
	 * String join
	 */

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3", "4");
		
		
		String result=String.join("-", list);
		
		System.out.println(result);
	}
}
