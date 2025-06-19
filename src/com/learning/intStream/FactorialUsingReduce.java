package com.learning.intStream;

import java.util.stream.IntStream;

public class FactorialUsingReduce {

	public static void main(String[] args) {
		int num=5;
		
		int factorial = IntStream.rangeClosed(1, num)
		.reduce(1, (a,b)->a*b);
		
		System.out.println(factorial);
	}
}
