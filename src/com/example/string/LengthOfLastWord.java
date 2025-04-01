package com.example.string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		int result = lengthOfLastWord("Am I Good Boy");
		
		System.out.println("Result  : "+result);
	}

	public static int lengthOfLastWord(String s) {
		int length = 0, i = s.length() - 1;
		System.out.println("length : "+ i );
		// Ignore trailing spaces
		while (i >= 0 && s.charAt(i) == ' ') {
			System.out.println(s.charAt(i));
			i--;
		}
		// Count the last word's length
		while (i >= 0 && s.charAt(i) != ' ') {
			//System.out.println(s.charAt(i));
			length++;
			i--;
		}

		return length;
	}
}
