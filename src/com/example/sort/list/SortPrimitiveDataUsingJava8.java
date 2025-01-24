package com.example.sort.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPrimitiveDataUsingJava8 {

	public static void main(String[] args) {
		List<Integer> list=getListValue();
		
		Collections.sort(list, (num1,num2)-> num1-num2);
		System.out.println("Ascending order sort : "+ list);
		
		List<Integer> list2=getListValue();
		Collections.sort(list2, (num1,num2)->num2-num1);
		
		System.out.println("Descending order sort : "+ list2);
		
	}
	
	private static List<Integer> getListValue(){
		return Arrays.asList(10,8,6,9,16,13,18,17);
	}
}
