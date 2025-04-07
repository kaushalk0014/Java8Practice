package com.learning.stream.foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(101, "Spring");
		map.put(102, "Hibernate");
		map.put(103, "React");
		map.put(104, "Java");
		
		
		map.forEach((k, v)-> System.out.println("key : "+k+"    Value : "+v));
		
		System.out.println("=======================");
		map.entrySet().stream().forEach(obj->System.out.println(obj));
	}
}
