package com.learning.string;

public class RomanConverter {

	public static void main(String[] args) {
		int number = 44;
        System.out.println("Roman numeral: " + intToRoman(number)); // Output: XLv
	}

	public static String intToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder roman = new StringBuilder();

		for (int i = 0; i < values.length && num > 0; i++) {
			while (num >= values[i]) {
				num=num-values[i];
				roman.append(symbols[i]);
			}
		}
		return roman.toString();
	}
}
