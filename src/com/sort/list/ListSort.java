package com.sort.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> list=getListValue();
		list.sort(Comparator.reverseOrder());// descending order  
		System.out.println("Descending order sort : "+list);
		
		List<Integer> intList=getListValue();
		intList.sort(Comparator.naturalOrder());
		System.out.println("Ascending order sort : "+intList);
		
		
		System.out.println("\n ------Using Collections class------");
		List<Integer> conList=getListValue();
		Collections.sort(conList); //Ascending order
		
		System.out.println("Ascending order sort : "+conList);
		
		//or we can use Comparator.naturalOrder to sort data in ascending order
		Collections.sort(conList, Comparator.reverseOrder());
		System.out.println("Comparator.reverseOrder() : "+ conList);
		
		Collections.sort(conList, Comparator.naturalOrder());
		
		System.out.println("Comparator.naturalOrder() : "+conList);
		
	}
	
	
	private static List<Integer> getListValue(){
		return Arrays.asList(10,8,6,9,16,13,18,17);
	}
}
