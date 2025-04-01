package com.example.string;

public class FirstOccurrenceInAString {

	public static void main(String[] args) {
		int result=strStr("ABC", "C");
		System.out.println("Result : "+ result);
	}
	 public static int strStr(String haystack, String needle) {
	        int m= haystack.length();
	        int n= needle.length();
	        
	        int strLength= m-n;
	        for(int i =0; i<=strLength; i++){
	        	String subStr= haystack.substring(i, i+n);
	            if(subStr.equals(needle)){
	                return i;
	            }
	        }
	        return -1;
	    }
	 
}
