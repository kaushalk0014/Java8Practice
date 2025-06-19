package com.example.string;

import java.util.Arrays;

public class ReverseStringsWithStreams {

	public static void main(String[] args) {
		String[] str = {"kaushal", "phone", "mobile"};
		
		String[] result = Arrays.stream(str)
		.map(s->new StringBuilder(s).reverse().toString())
		.toArray(String[]::new);
		
		for(String s: result) {
			System.out.println(s);
		}
	}
}
