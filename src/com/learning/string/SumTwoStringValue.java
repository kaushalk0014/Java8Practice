package com.learning.string;

public class SumTwoStringValue {
	public static void main(String[] args) {
		System.out.println("Result : "+add("16","6"));
		System.out.println("Result : "+add("36","66"));
	}

	private static String add(String str1, String str2) {
		
		int i = str1.length() -1;
		int j = str2.length() -1;
		int curryDigit=0;
		StringBuffer buffer=new StringBuffer();
		while(i>=0 || j>=0 || curryDigit >0) {
			int num1 = i>= 0 ? str1.charAt(i) - '0' : 0;
			int num2 = j>= 0 ? str2.charAt(j) - '0' : 0;
			
			int sum=num1+num2+curryDigit;
			curryDigit= sum /10;
			buffer.append(sum%10);
			i--;
			j--;
		}
		return buffer.reverse().toString();
	}

	 
}
