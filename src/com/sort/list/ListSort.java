package com.sort.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> list=getIntValue();
		list.sort(Comparator.reverseOrder());// descending order  
		
		System.out.println(list);
		
		
	}
	
	
	private static List<Integer> getIntValue(){
		return Arrays.asList(10,8,6,9,16,13,18,17);
	}
}
