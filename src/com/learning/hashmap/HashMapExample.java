package com.learning.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Pankaj", 1500);
		map.put("Rakesh", 1600);
		map.put("Anil", 1200);
		map.put("Dinesh", 1400);
		map.put("Rajesh", 1700);
		
		 for(Map.Entry<String, Integer> entry: map.entrySet()) {
			 
			 String name=entry.getKey();
			 if(name.equalsIgnoreCase("rakesh")) {
				 map.put("Rakesh", 5000);
			 }
			 
			 //map.remove(entry.getKey());// java.util.ConcurrentModificationException
			 //map.remove("Anil");
			 
		 }
		 
		 System.out.println(map);
		 
		 /*
		  * To make a HashMap synchronized in Java
		  */
		 
		 System.out.println("  Collections.synchronizedMap ");
		 Map<String, Integer> synchMap = Collections.synchronizedMap(new HashMap<String, Integer>());
		 
		 synchMap.put("Pankaj", 1500);
		 synchMap.put("Rakesh", 1600);
		 synchMap.put("Anil", 1200);
		 synchMap.put("Dinesh", 1400);
		 synchMap.put("Rajesh", 1700);
		 
		 for(String key: synchMap.keySet()) {
			 //synchMap.remove(key); //// java.util.ConcurrentModificationException
			 if(key.equalsIgnoreCase("Anil")) {
				 synchMap.remove("Anil"); // safe way to remove
			 }
		 }
		 
		 System.out.println(synchMap);
	}
}
