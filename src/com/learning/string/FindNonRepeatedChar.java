package com.learning.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNonRepeatedChar {

	/*
	 * Using map
	 */
	public static void main(String[] args) {
		String input= "abcbacdabe";
		
		Map<String , Integer> map = new LinkedHashMap<String, Integer>();
		
		for(String str: input.split("")) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First not repeated char is : "+entry.getKey()+"   Reapeated : "+entry.getValue());
			break;
			}
		}
		
	}
}
