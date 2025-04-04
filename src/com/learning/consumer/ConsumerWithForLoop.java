package com.learning.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithForLoop implements Consumer<Integer> {
	@Override
	public void accept(Integer num) {
		System.out.println("Print input data : " + num);

	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 8, 44, 55, 11);
		printDataApproact1(list);
		printDataApproact2(list);
		printDataApproact3(list);
	}
	
	private static void printDataApproact3(List<Integer> list) {
		System.out.println("Approact : 3 ");
		
		list.stream().forEach(ConsumerWithForLoop::printData);
		
	}
	private static void printData(Integer num){
		System.out.println("Data is : "+ num);
	}
	private static void printDataApproact2(List<Integer> list) {
		System.out.println("Approact : 2 ");
		
		Consumer<Integer> con=num->System.out.println("Print data : "+num);
		list.stream().forEach(con);
		
	}
	private static void printDataApproact1(List<Integer> list) {
		System.out.println("Approact : 1 ");
		
		list.stream().forEach(new ConsumerWithForLoop());
	}
}
