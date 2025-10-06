package com.revision.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(105, "Kaushal");
		map.put(402, "Rakesh");
		map.put(108, "Pankaj");
		map.put(101, null);
		map.put(106, null);
		//map.put(null, "Rohan"); In Tree map we con't add key as null but value we can add as null
		
		System.out.println(map);
		
	}
}
