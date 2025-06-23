package com.learning.number;

import java.util.stream.IntStream;

public class FactorialWithIntStream {

	public static void main(String[] args) {
		int k=5;
		int result = IntStream
		.rangeClosed(1, k)
		.reduce(1, (a,b)->a*b);
		
		System.out.println("Factorial : "+result);
	}
}
