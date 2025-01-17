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
		
		
		System.out.println("\n --------Sort data using list.sort() comparator compare method -------- ");
		
		List<Integer> listValue=getListValue();
		listValue.sort(new Comparator<Integer>() {
		
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		System.out.println("Ascending order sort : "+listValue);
		
		List<Integer> listValue2=getListValue();
		listValue2.sort(new Comparator<Integer>() {
		
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		System.out.println("Descending order sort : "+listValue2);
		
		System.out.println("\n --------Sort data using Collections.sort compare method -------- ");
		
		List<Integer> sortList=getListValue();
		
		Collections.sort(sortList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
			
		});
		System.out.println("Ascending order sort : "+sortList);
		
		sortList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		System.out.println("Descending order sort : "+sortList);
	}
	
	
	
	private static List<Integer> getListValue(){
		return Arrays.asList(10,8,6,9,16,13,18,17);
	}
}
