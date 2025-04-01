package com.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {

	public static void main(String[] args) {
		String name="kaushal";
		
		Map<Character, Long> mapResult= name.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapResult);
		
		//using map
		
		usingMap(name);
		
	}

	private static void usingMap(String name) {
		char arr[]=name.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch: arr) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println("Using Map");
		System.out.println(map);
		
		
	}
}
