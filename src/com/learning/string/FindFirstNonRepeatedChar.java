package com.learning.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class FindFirstNonRepeatedChar {
	public static void main(String[] args) {
		String input = "abcbacdabe";

		Stack<String> stack = new Stack<String>();
		for (String str : input.split("")) {

			if (stack.contains(str)) {
				stack.remove(str);
			} else {
				stack.push(str);
			}
		} // end for loop

		System.out.println("First Non Repeated Char : " + stack.firstElement());
		
		System.out.println("-------------------------------");
		
		System.out.println("Approach 2");
		
		System.out.println("Result : "+ findFirstNonRepeatedCharUsingHashMap(input));
		
		System.out.println("=============Find max char in given string===========");
		
		System.out.println("Result : "+findMaxnRepeatedChar(input));
	}

	private static String findFirstNonRepeatedCharUsingHashMap(String input) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String str : input.split("")) {
			map.put(str, map.getOrDefault(str, 0)+1);

		}
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	private static String findMaxnRepeatedChar(String input) {
		//input String input = "abcbacdabe";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for (String str : input.split("")) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		
		int count=0;
		String maxChar=null;
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(count<entry.getValue()) {
				count=entry.getValue();
				maxChar= entry.getKey();
			}
		}
		return maxChar;
	}
}
