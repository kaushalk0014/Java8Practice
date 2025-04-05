package com.learning.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		approach1();
		approach2();
		approach3();
		approach4();
		approach5();
	}

	private static void approach1() {
		System.out.println("Approach 1 :");
		Supplier<String> supplier = () -> {
			return "I am supplier interface";
		};
		System.out.println("Get Result : " + supplier.get());
	}

	private static void approach2() {
		System.out.println("Approach 2 :");
		Supplier<String> supplier = () -> "I am supplier interface single line";

		System.out.println("Get Result : " + supplier.get());
	}

	private static void approach3() {
		System.out.println("Approach 3 :");
		List<String> list = Arrays.asList("Spring", "Html", "JavaScript", "Java");
		Supplier<String> supplier = () -> "Python";

		String result = list.stream().findAny().orElseGet(supplier);
		System.out.println(result);

	}
	
	private static void approach4() {
		// In this example I am not passing any value in list
		System.out.println("Approach 4 :");
		List<String> list = Arrays.asList();
		Supplier<String> supplier = () -> "Python";

		String result = list.stream().findAny().orElseGet(supplier);
		System.out.println(result);
	}
	
	private static void approach5() {
		// I am using find first
		System.out.println("Approach 4 :");
		List<String> list = Arrays.asList();
		Supplier<String> supplier = () -> "Python";

		String result = list.stream().findFirst().orElseGet(supplier);
		System.out.println(result);
	}

}
