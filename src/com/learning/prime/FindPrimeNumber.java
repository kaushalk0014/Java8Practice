package com.learning.prime;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNumber {


	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(15, 45, 25, 65, 36, 88, 55, 41, 75, 61);
		
		//List<Integer> primeNumbers=list.stream().filter(FindPrimeNumber::isPrime).toList();
		List<Integer> primeNumbers=list.stream().filter(FindPrimeNumber::isPrime2).toList();
		
		Integer sumPrimeNumber=primeNumbers.stream().reduce(0,(sumPrime, num)->sumPrime+num);
		

		System.out.println("Sum of prime number : "+sumPrimeNumber);
		primeNumbers.forEach(System.out::println);
		
		//System.out.println(Math.sqrt(31));
	}

	public static boolean isPrime(Integer num) {
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime2(Integer num) {
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}


}
