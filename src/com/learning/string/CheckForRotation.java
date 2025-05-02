package com.learning.string;

public class CheckForRotation {

	public static void main(String[] args) {
//		String str1 = "ABCD";   //ABCDABCD
//		String str2 = "CDAB";
		
		String str1 = "abcd";  //abcdabcd
		String str2 = "acbd";
		 
		if (areRotations(str1, str2)) {
			System.out.println("Strings are rotations of each other.");
		} else {
			System.out.println("Strings are not rotations of each other.");
		}
	}

	private static boolean areRotations(String str1, String str2) {
		if(str1.length()==str2.length() && (str1+str1).contains(str2)) {
			return true;
		}
		return false;

	}
}
