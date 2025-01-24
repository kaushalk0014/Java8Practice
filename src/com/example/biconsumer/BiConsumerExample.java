package com.example.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, String>{

	@Override
	public void accept(String str1, String str2) {
		System.out.println("Input 1 : "+ str1 +" Input 2 : "+ str2);
		
	}
	
	public static void main(String[] args) {
		BiConsumerExample biConsumerExample=new BiConsumerExample();
		biConsumerExample.accept("Hello", "Stream");
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("Pankaj", 18000);
		map.put("Ranjan", 20000);
		
		map.forEach((k, v)->System.out.println("Key : "+ k +" Value : "+ v));
	}
}
