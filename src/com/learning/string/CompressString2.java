package com.learning.string;

import java.util.Arrays;

public class CompressString2 {

	public static void main(String[] args) {
		String str = "AAAaccbeGGGHHAHCAB";
		// output: A4C2BEG3H2

		str = str.toUpperCase();

		char chArr[] = str.toCharArray();
		Arrays.sort(chArr);

		String newStr = new String(chArr);

		int i = 0;
		StringBuffer buffer = new StringBuffer();

		while (i < newStr.length()) {
			char ch = newStr.charAt(i);
			int count = 1;

			while (i + 1 < newStr.length() && newStr.charAt(i + 1) == ch) {
				count++;
				i++;
			}

			buffer.append(ch).append("=").append(count).append(", ");
			i++;
		}
		String result = buffer.substring(0, buffer.length() - 2);

		System.out.println("Result : " + result);
	}
}
