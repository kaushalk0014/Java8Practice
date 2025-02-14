package com.example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		.collect(Collectors.collectingAndThen(
				Collectors.averagingDouble(Double::doubleValue), 
				Math::round));
		
		System.out.println("Round avg salary : "+ roundSalary);
		
		
		System.out.println("\n 4. Stream.takeWhile and Stream.dropWhile");
		
		List<Integer> listNumber=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("List Numbers : "+ listNumber +"\n");
		List<Integer> num1=listNumber.stream()
				.takeWhile(num-> num < 4)// It will take after <4
				.collect(Collectors.toList());
		System.out.println("Stream Take While : "+ num1);
		
		List<Integer> num2=listNumber.stream().dropWhile(num -> num<5).collect(Collectors.toList());
		
		System.out.println("Stream Drop while : "+ num2);
		
		System.out.println("\n");
		
		List<Integer> listNumber2=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> num3 = listNumber2.stream()
				.dropWhile(num -> num < 3)	// It will drop number before <3
				.takeWhile(num -> num < 7)	//
				.collect(Collectors.toList());
		System.out.println("Take while and Drop while : "+num3);
		
		System.out.println("\n ----------- 5. Collection.teeing ---------------");
		
		//find min and max value in given list
		List<Integer> minAndMaxList=Stream.iterate(1, n->n+1)
				.limit(10)
				.collect(Collectors.toList());
		System.out.println("Min and Max values : "+minAndMaxList);
		
		Map<String, Integer> mapMinAndMax=minAndMaxList.stream()
		.collect(Collectors
		.teeing(Collectors.minBy(Integer::compareTo),
				Collectors.maxBy(Integer::compareTo),
				(n1, n2)->Map.of("Min",n1.get(), "Max", n2.get())));
		
		System.out.println("Min and Max Value : "+mapMinAndMax);
		
		Integer min=Collections.min(minAndMaxList);
		
		System.out.println("\n --------- 6. Stream.concat()------------");
		
		// Stream concat is use for merge two list in a single list
		Stream<Integer> stm1=Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> stm2=Stream.of(5, 6, 7, 8);
		
		Stream<Integer> streamConcat=Stream.concat(stm1, stm2);
//		System.out.println("Stream Concat : "+ streamConcat);
//		//streamConcat.forEach(System.out::print);
//		long sumValue1=streamConcat.mapToInt(Integer::intValue).sum();
//		System.out.println("Sum : "+sumValue1);
		
		int sum=0;
		Function<Integer, Integer> fun=num->{
			return sum+num;
		};
		 
		long sumValue2 =streamConcat.mapToInt(num-> fun.apply(num)).sum();
		System.out.println("Sum2 : "+sumValue2);
		
		System.out.println("\n -------------7. Collectors.partitioningBy-------------");
		
		List<Integer> listNum=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		Map<Boolean, List<Integer>> partioningBy= 
		listNum.stream()
		.collect(Collectors.partitioningBy(num-> num%2==0));
		
		System.out.println(partioningBy);
		System.out.println("Even Number : "+partioningBy.get(Boolean.TRUE));
		System.out.println("Odd Number : "+partioningBy.get(Boolean.FALSE));
		
		System.out.println("\n --------------8. InsStream for Ranges-----------");
		
		List<Integer> intStram=IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println("IntStream : "+ intStram);
		
		List<Integer> rangedClosed = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		
		System.out.println(" Ranged Closed : "+ rangedClosed);
	}
}
