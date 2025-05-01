package com.learning.string;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "Madam";
		boolean isPalindrome = isPalindrome(str);
		System.out.println("Is palindrome: " + isPalindrome);
	}

	private static boolean isPalindrome(String str) {
		str = str.toLowerCase().replace(" ", "");
		int low = 0;
		int high = str.length() - 1;
		while (low <= high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
}
