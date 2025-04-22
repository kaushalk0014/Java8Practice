package com.learning.map;

import java.util.Arrays;
import java.util.List;

public class AddGreashMarks {

	public static void main(String[] args) {
		 
		
		List<Integer> list= Arrays.asList(40,63,29,55,45,28,53,74,22);
		List<Integer> result= list.stream().map(num-> num+5).toList();
		System.out.println(result);
	}
}
