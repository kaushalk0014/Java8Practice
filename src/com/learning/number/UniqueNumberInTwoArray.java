package com.learning.number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNumberInTwoArray {

	public static void main(String[] args) {
		int [] arr1 = {1,4,9,8};
		int [] arr2 = {1,3,2,0,6};
		
		
		Set<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		
		Set<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		
		Set<Integer> unique1 = new HashSet<Integer>(list1);
		
		Set<Integer> unique2 = new HashSet<Integer>(list2);
		
		unique1.removeAll(list2);
		unique2.removeAll(list2);
		
		
		Set<Integer> result= new HashSet<Integer>();
		result.addAll(unique1);
		result.addAll(unique2);
		
		System.out.println(result);
		
	}
}
