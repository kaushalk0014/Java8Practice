package com.learning.string;

import java.util.Iterator;

public class FindFirstRepeatedCharWithOutExtraSpace {

	public static void main(String[] args) {
		String str = "I am an Indian".toLowerCase().replace(" ", "");
		
		for (int i = 0; i <str.length()-1; i++) {
			char ch=str.charAt(i);
			
			for (int j = i+1; j <str.length(); j++) {
				if(ch== str.charAt(j)) {}
				System.out.println("Found character with duplicate value : "+ch);
				return;
			}
		}
		
		//output will be : I
	}
}
