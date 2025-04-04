package com.learning.consumer;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Print data : "+ t);
	}
	
	public static void main(String[] args) {
		printDataApproach1();
		printDataApproach2();
		printDataApproach3();
	}
	
	private static void printDataApproach1() {
		System.out.println("Approach 1");
		Consumer<Integer> con= new ConsumerImpl();
		con.accept(10);
	}
	
	private static void printDataApproach2() {
		System.out.println("Approach 2");
		Consumer<Integer> con= new ConsumerImpl();
		con.accept(20);
	}
	
	private static void printDataApproach3() {
		System.out.println("Approach 3");
		Consumer<Integer> con= num ->{
			System.out.println("Print data :"+num);
		};
		con.accept(20);
	}
}


class PrintData implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Print data : "+ t);
	}
	
}
