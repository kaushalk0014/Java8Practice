package com.learning.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		approach1();
		approach2();
		approach3();
	}

	private static void approach1() {
		System.out.println("Approach 1 :");
		Predicate<Integer> evenCheck=num->num%2==0?true:false;
		boolean result = evenCheck.test(10);
		System.out.println("Is Even : "+result);
		
	}
	
	private static void approach2() {
		System.out.println("Approach 2 find even in list :");
		//use of predicate
		Predicate<Integer> predicate=num->num %2==0 ?true:false;
		List<Integer> list=Arrays.asList(12,45,15,65,20,58);
		
		List<Integer> result=list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(result);
		
	}
	
	private static void approach3() {
		System.out.println("Approach 3 find even in list :");
		//use of predicate
		List<Integer> list=Arrays.asList(16,20,15,65,26,27);
		List<Integer> result=list.stream().filter(num->num%2==0?true:false).collect(Collectors.toList());
		System.out.println(result);
		
	}
	
	private static void approach4() {
		System.out.println("Approach 4 find even in list :");
		//use of predicate
		//Note: we can also remove ternary operator
		List<Integer> list=Arrays.asList(16,20,15,65,26,27);
		List<Integer> result=list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(result);
		
	}

	
	
}
