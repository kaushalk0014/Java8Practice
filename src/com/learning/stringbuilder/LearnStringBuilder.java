package com.learning.stringbuilder;

public class LearnStringBuilder {

	public static void main(String[] args) {
		StringBuilder builder=new  StringBuilder("spring react");
		builder.insert(2, "java");
		
		System.out.println("Result : "+builder.toString());
	}
}
