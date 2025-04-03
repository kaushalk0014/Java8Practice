package com.learning.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,5,4,8,2,6,7,9,3);
		
		//If we want to calculate sum of list before java 8 then we should use for loop
		//below example
		int sumTotal=0;
		for(int num: list) {
			sumTotal=sumTotal+num;
		}
		System.out.println("Sum : "+ sumTotal);
		
		
		//using java 8, we can use reduce do sum of list
		// here 0 is a initail value 
		int result=list.stream().reduce(0, (sum, num)-> sum+num);
		
		System.out.println("Sum using java 8 : "+result);
		
		//below example we can add initial value also
		
		//reduce(T identity, BinaryOperator<T> accumulator)
		int resultSum = list.stream().reduce(5 , (sum, num)-> sum+num);
		
		//here output value will be inital value + total 
		// 5+45
		System.out.println("Sum using java 8 with initail value : "+resultSum);
		
		
		//we have many mode way to sum list
		
		Integer sum=list.stream().mapToInt(num-> num).sum();
		
		System.out.println("Sum using mapToInt : "+sum);
		
		Optional<Integer>  sum2= list.stream().reduce(Integer::sum);
		if(!sum2.isEmpty())
		System.out.println("Sum of list using agrigate function : "+ sum2.get());
		
		
		// multiply all list value 
		
		//if we using identity as 0 then all value should be 0, because 0 multiplication
		Integer resultMulti=list.stream().reduce(0, (multi, num )-> num*multi);
		System.out.println("Multipication : "+resultMulti);
		
		Integer resultMulti2=list.stream().reduce(1, (multi, num )-> num*multi);
		System.out.println("Multiplication : "+resultMulti2);
		
	}
}
