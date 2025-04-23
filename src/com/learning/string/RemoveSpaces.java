package com.learning.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str= "spring framework";
		
		String result=str.replaceAll("\\s", "");
		
		System.out.println(result);
	}
}
