package com.learning.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "kaushal";
		
		String result="";
		for (int i = str.length()-1; i>= 0; i--) {
			result+=str.charAt(i);
		}
		
		System.out.println("Result : "+result);
	}
}
