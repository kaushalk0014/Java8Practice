package com.stream.exception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestException {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("10", "20", "30", "40", "50");

		list.stream().forEach(num -> System.out.println(num));

		List<String> list2 = Arrays.asList("A10", "20", "30", "40", "50");
		// list2.stream().forEach(num-> System.out.println(Integer.parseInt(num)));

		System.out.println("---------------------------");

		list2.stream().forEach(TestException::printData);

		System.out.println("================== approach 3==============");
		list2.stream().forEach(printNum(num -> System.out.println(Integer.parseInt(num))));

		System.out.println("================== approach 4==============");

		List<String> list4 = Arrays.asList("A10", "20", "30", "40", "50");
		list4.stream().forEach(handleGenericException(num->System.out.println(Integer.parseInt(num)), NumberFormatException.class));
	
		System.out.println("--------------------------------");
		List<Integer> list5 = Arrays.asList(10,0);
		//list5.forEach(num-> System.out.println(20/num));
		
		list5.forEach(handleGenericException(num->System.out.println(30/num), ArithmeticException.class));
		
		System.out.println(" Handle Exception for checked exception ");
		
		List<Integer> list6=Arrays.asList(600,800);
		
		list6.forEach(num->{
			try {
				Thread.sleep(num);
				System.out.println(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}//main close

	static Consumer<String> printNum(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception e) {
				System.out.println("Number formate exception");
			}
		};
	}

	private static void printData(String num) {
		try {
			System.out.println(Integer.parseInt(num));
		} catch (Exception e) {
			System.out.println("Number formate exception");
		}
	}

	static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exObj = exObjClass.cast(e);
					System.out.println("exception : "+ exObj.getMessage());
				} catch (ClassCastException cse) {
					throw e;
				}
			}
		};
	}
}
