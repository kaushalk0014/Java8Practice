package com.learning.string;

import java.util.Arrays;

public class SortAlphaNumeric {

	public static void main(String[] args) {
		String str = "a5p7p8l4e6";

		// Convert string to char array
		char[] chars = str.toCharArray();

		// Sort the char array
		Arrays.sort(chars);

		// Create a new string from sorted char array
		String sortedData = new String(chars);

		System.out.println(sortedData); // Output: 45678aelpp
	}

}
