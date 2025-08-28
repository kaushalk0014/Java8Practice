package com.learning.string;

import java.util.Arrays;

public class StringsAnagrams {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		System.out.println("Are the two strings anagrams :  " + isAnagrams(str1, str2));
	}
	private static boolean isAnagrams(String str1, String str2) {
		
		if(str1.isBlank() ||str2.isBlank() || str1.length() != str2.length()) {
			return false;
		}
		char [] char1 = str1.toCharArray();
		char [] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
	}
}
