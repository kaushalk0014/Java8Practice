package com.learning.list;

import java.util.HashSet;
import java.util.Set;

public class FindSumOfTwoTargate {

	public static void main(String[] args) {
		int arr[] = {12,15,16,20,18,0,8,88,22,-2};
		int target = 20;
		//output : 12, 8
		//output : 20, 0
		//output : 22, -2
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i< arr.length; i++) {
			
			int num = target- arr[i];
			if(set.contains(num)) {
				System.out.println(arr[i]+ "    "+num);
			}
			set.add(arr[i]);
		}
	}
}
