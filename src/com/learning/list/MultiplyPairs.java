package com.learning.list;

import java.util.ArrayList;
import java.util.List;

public class MultiplyPairs {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i< list.size() ; i=i+2) {
			result.add(list.get(i) * list.get(i+1));
		}
		
		System.out.println("Result : "+result);
	}
}
