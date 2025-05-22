package com.learning.string;

import java.util.HashMap;
import java.util.Map;

public class FindAnagrams {

	public static void main(String[] args) {

		System.out.println(findAnagram("listen", "silent")); // true
		System.out.println(findAnagram("hello", "world")); // false
		System.out.println(findAnagram("hello", "heoll")); // true
	}

	private static boolean findAnagram(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str2.toCharArray()) {
			if (map.containsKey(ch)) {
				if (map.get(ch) == 1) {
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch) -1);
				}
			} else {
				return false;
			}
		}

		return map.isEmpty();
	}
}
