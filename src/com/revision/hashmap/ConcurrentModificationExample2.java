package com.revision.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationExample2 {

	public static void main(String[] args) {

		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<Integer, String>());

		map.put(101, "Kaushal");
		map.put(108, "Rakesh");
		map.put(205, "Pankaj");
		map.put(150, "Akash");
		map.put(175, "Rohan");

		System.out.println(map);

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> m = iterator.next();
			if (m.getValue().equalsIgnoreCase("Akash")) {
				iterator.remove();// safe remove
			}
		}
		System.out.println(map);
		
		map.keySet().removeIf(key-> map.get(key).equalsIgnoreCase("Kaushal"));
		System.out.println(map);
		
	}
}
