package com.learning.hashtable;

import java.util.Hashtable;

public class HashTableExample {

	/*
	 * HashTable not allow null key and null value
	 */
	public static void main(String[] args) {
		Hashtable<String, String> map=new Hashtable<String, String>();
		
		map.put("name", "Rohan");
		System.out.println(map);
		
		//map.put("mobile", null);		//HashTable not allow null value
		//map.put(null, "Male");		//HashTable not allow null key
		System.out.println(map);
	}
}
