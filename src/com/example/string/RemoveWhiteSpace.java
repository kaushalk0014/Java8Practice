package com.example.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str=" M y n a me ka u s h a l   ";
		
		System.out.println(str.trim());
		
		String replaceString=str.replaceAll("\\s", "");
		
		System.out.println("Replace String value : "+replaceString);
	}
	
	
}
