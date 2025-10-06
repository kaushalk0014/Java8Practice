package com.revision.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Kaushal");
		map.put(108, "Rakesh");
		map.put(205, "Pankaj");
		map.put(150, "Akash");
		map.put(175, "Rohan");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			
			/*
			 * We con't modify map data while iterating it, It will throw 
			 *  java.util.ConcurrentModificationException 
			 */
			if(m.getValue().equalsIgnoreCase("kaushal")){
				map.remove(m.getKey());
				System.out.println("Removed");
			}
		}
	}
}
