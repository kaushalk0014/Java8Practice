package com.learning.string;

import java.util.Arrays;

public class FindLongestString {

	/*
	 * Find the longest string from given array
	 */

	public static void main(String[] args) {
		String arr[]= {"spring", "hibernate", "java", "react", "angular"};
		
		
		String longestWord = Arrays.stream(arr)
		.reduce((word1, word2)-> word1.length()>word2.length()? word1:word2).get();
		
		System.out.println(longestWord);
	}
	
	
}
