package com.example.pradicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestClass {

	//This is normal way writing the code
	public static int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		
		System.out.println("The Square of 8: " + square(8));
		System.out.println("The Square of 6: " + square(6));
		
		 
		//for solution above code for do square
		System.out.println("\n Using Function");
		Function<Integer,String> fun=(num)->""+(num*num);
		System.out.println("The Square of 8: " +fun.apply(8));
		System.out.println("The Square of 9: " +fun.apply(9));
		
		
	}
}
