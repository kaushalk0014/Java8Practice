package com.learning.number;

import java.util.stream.IntStream;

public class SkipLimitExample {

	/*
	 * Skip and limit example
	 */
	
	public static void main(String[] args) {
		IntStream.range(1, 10)
		.skip(1)
		.limit(8)
		.forEach(num->{
			System.out.println(num);
		});;
	}
}
