package com.learning.string;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {

	//output will be : I

	public static void main(String[] args) {
		String str = "I am an Indian".toLowerCase().replace(" ", "");
		Set<Character> set = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				System.out.println("First Duplicate Character : " + ch);
				return;
			}
			set.add(ch);
		}
	}
}
