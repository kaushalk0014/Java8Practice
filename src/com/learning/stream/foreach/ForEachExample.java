package com.learning.stream.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Spring");
		list.add("Hibernate");
		list.add("Java");
		list.add("React");
		list.add("Angular");
		
		//old way printing data(list)
		for(String str: list) {
			System.out.println("Data : "+str);
		}
		
		//using stream API
		approach1(list);
		approach2(list);
		approach3(list);
	}

	private static void approach1(List<String> list) {
		System.out.println("Approach 1: ");
		Consumer<String> consumer= str->System.out.println("Result : "+str);
		list.stream().forEach(consumer);
	}
	
	private static void approach2(List<String> list) {
		System.out.println("Approach 2: ");
		list.stream().forEach(str->System.out.println("Result : "+ str));
	}
	
	private static void approach3(List<String> list) {
		System.out.println("Approach 3: ");
		list.stream().forEach(System.out::println);
	}
	
}
