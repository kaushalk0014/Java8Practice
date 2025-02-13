package com.example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFeatures {

	public static void main(String[] args) {
		// 1. Stream.ofNullable
		// 2. Stream.iterable()
		// 3. Collections.collectingAndThen
		// 4. Stream.takeWhile and Stream.dropWhile
		// 5. Collection.teeing
		// 6. Stream.concat()
		// 7. Collectors.partitioningBy
		// 8. InsStream for Ranges

		List<String> list = Arrays.asList("Rahul", "Pankaj", null, "Mnish", "Deepak", "Rohan", null, "Sohan");
		System.out.println(list);
		System.out.println("\n");
		List<String> listName=list.stream()
		.filter(name->name!=null)
		.collect(Collectors.toList());
		//Above stream filtering null value
		System.out.println(listName);
		
		List<Stream<String>> ofNullable=list.stream().map(Stream::ofNullable)
		.collect(Collectors.toList());
		
		//to over come stream list we need to use flatMap
		
		List<String> ofNullable2=list.stream().flatMap(Stream::ofNullable)
				.collect(Collectors.toList());
		
		
		System.out.println(ofNullable2);
		System.out.println("\n");
		
		//2.	Stream.iterate()
		//To generate sequence of number  
		List<Integer> streamIterate=Stream.iterate(1, n->n+2)
		.limit(5).collect(Collectors.toList());
		
		System.out.println("Stream Iterate : "+ streamIterate);
		System.out.println("\n");
		
		List<Integer> streamIterate2=Stream.iterate(1, n->n+1)
				.limit(8).collect(Collectors.toList());
				
				System.out.println("Stream Iterate : "+ streamIterate2);
				System.out.println("\n");
		
		
		//3.	Collectors.collectingAndThen
		//calculate avg salary & round up to nearest integer
		
		Double avgSalary=GetListEmployee.getList().stream()
		.mapToDouble(Employee::getSalary)
		.boxed()
		.collect(Collectors.averagingDouble(Double::doubleValue));
		
		System.out.println("Salary avg : "+ avgSalary);
		
		//solution 
		
		
		long roundSalary=GetListEmployee.getList().stream()
		.mapToDouble(Employee:: getSalary)
		.boxed()
		.collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue), Math::round));
		
		System.out.println("Round avg salary : "+ roundSalary);
		
		
		System.out.println("\n 4. Stream.takeWhile and Stream.dropWhile");
		
		List<Integer> listNumber=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("List Numbers : "+ listNumber +"\n");
		List<Integer> num1=listNumber.stream().takeWhile(num-> num < 4).collect(Collectors.toList());
		System.out.println("Stream Take While : "+ num1);
		
		
		List<Integer> num2=listNumber.stream().dropWhile(num -> num<5).collect(Collectors.toList());
		
		System.out.println("Stream Drop while : "+ num2);
		
		System.out.println("\n");
		
		List<Integer> num3= listNumber
				.stream()
				.takeWhile(num-> num<3)
				.dropWhile(num -> num<6)
				.collect(Collectors.toList());
		System.out.println("Take while and Drop while : "+num3);
		
		
	}
}
