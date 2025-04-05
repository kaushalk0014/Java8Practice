package com.learning.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintListData {
	public static void main(String[] args) {

		Consumer<Integer> consumer = num -> {
			System.out.println("Data is : " + num);
		};

		List<Integer> list = Arrays.asList(5, 4, 6, 8, 7, 9);
		
		list.forEach(consumer);

	}
}
