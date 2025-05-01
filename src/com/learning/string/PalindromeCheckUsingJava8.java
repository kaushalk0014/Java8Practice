package com.learning.string;

import java.util.stream.IntStream;

public class PalindromeCheckUsingJava8 {

	public static void main(String[] args) {
		String str = "Madam";
		boolean isPalindrome = isPalindrome(str);
		System.out.println("Is palindrome: " + isPalindrome);
	}

	private static boolean isPalindrome(String str) {
		 String valiedString = str.toLowerCase().replace(" ", "");
		 
		 return IntStream.range(0, valiedString.length()/2).peek(k->{
			 System.out.println(k);
		 })
		 .allMatch(i-> valiedString.charAt(i) == valiedString.charAt(valiedString.length()-1-i));
	}
}
