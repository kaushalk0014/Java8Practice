package com.learning.string;

import java.util.Arrays;

public class CheckAnagramsString {

	public static void main(String[] args) {
		String str="geeks";
		String str2="kseeg";
		
	    char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean isAnagram = Arrays.equals(arr1, arr2);
		
		System.out.println(isAnagram);
	}
}

