package com.example.bipradicatec;

import java.util.function.BiPredicate;

public class BiPradicatecExample implements BiPredicate<String, String>{

	@Override
	public boolean test(String str1, String str2) {
		return str1.equals(str2);
	}
	
	
	public static void main(String[] args) {
		BiPradicatecExample example=new BiPradicatecExample();
		
		System.out.println("Is palindrome string : "+ example.test("Spring", "Spring"));
	}
}
