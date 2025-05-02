package com.learning.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortAlphaNumeric2 {

	public static void main(String[] args) {
		String str = "a5p7p8l4e6";
		
		List<Character> letters=new ArrayList<Character>();
		List<Character> digit=new ArrayList<Character>();
		
		for(char ch: str.toCharArray()) {
			if(Character.isDigit(ch)) {
				digit.add(ch);
			}else {
				letters.add(ch);
			}
		}
		
		Collections.sort(digit);
		Collections.sort(letters);
		
		StringBuilder result=new StringBuilder();
		for(char ch: digit) {
			result.append(ch);
		}
		for(char letter: letters) {
			result.append(letter);
		}
		
		System.out.println("Result : "+ result);
	}
}
