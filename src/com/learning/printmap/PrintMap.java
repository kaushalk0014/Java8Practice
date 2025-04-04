package com.learning.printmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintMap {

	public static void main(String[] args) {
		
		String str="Framework";
		Map<Character, Long> map=str.chars().mapToObj(ch-> (char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		map.entrySet().forEach(PrintMap::printData);
	}
	
	private static void printData(Map.Entry<Character, Long> entry) {
		System.out.println("Key : " + entry.getKey() + "          Value : " + entry.getValue());
	}
}
