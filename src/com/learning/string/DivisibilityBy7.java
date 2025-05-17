package com.learning.string;

public class DivisibilityBy7 {

	public static void main(String[] args) {

		System.out.println("Result : "+isDivisibleBy7(35));
		System.out.println("Result 2 : "+isDivisibleBy7Sec(35));
	}

	private static boolean isDivisibleBy7(int num) {
		if (num == 0 || num == 7) {
			return true;
		}
		if (num < 10) {
			return false;
		}
		int lastDigit = num % 10;
		int rest = num / 10;

		// Apply the rule: subtract 2 * lastDigit from rest
		return isDivisibleBy7(Math.abs(rest - 2 * lastDigit));
	}
	
	private static boolean isDivisibleBy7Sec(int num) {
		if (num == 0 || num == 7) {
			return true;
		}
		while(num>=7) {
			num=num-7;
		}
		return num==0;
	}
}
