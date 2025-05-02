package com.learning.string;

import java.util.Optional;
import java.util.stream.Stream;

public class CheckForRotationUsingJava8 {

	public static void main(String[] args) {
		String str1 = "ABCD";   //ABCDABCD
		String str2 = "CDAB";

//		String str1 = "abcd"; // abcdabcd
//		String str2 = "acbd";

		if (areRotations(str1, str2)) {
			System.out.println("Strings are rotations of each other.");
		} else {
			System.out.println("Strings are not rotations of each other.");
		}
	}

	private static boolean areRotations(String str1, String str2) {
		 
		return Optional.ofNullable(str1)
		.filter(s-> s.length()==str2.length())
		.map(s-> s+s)
		.filter(s-> s.contains(str2))
		.isPresent();
	}
}
