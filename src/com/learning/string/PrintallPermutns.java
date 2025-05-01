package com.learning.string;

public class PrintallPermutns {

	public static void main(String[] args) {
		String str = "cat";
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println("1 Param : "+str.substring(i+1));
//		}
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println("2 Param : "+str.substring(0,i));
//		}
//		System.out.println("----");
		printAllPre(str, "");
	}

	private static void printAllPre(String str, String str2) {
		if (str == null || str.isEmpty()) {
			System.out.println(str2 + "");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String str3 = str.substring(0, i) + str.substring(i + 1);
			printAllPre(str3, str2 + ch);
		}
	}
}
