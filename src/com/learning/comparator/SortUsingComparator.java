package com.learning.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortUsingComparator {

	public static void main(String[] args) {

		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(101, "Kaushal", 25));
		list.add(new Employee(105, "Pankaj", 32));
		list.add(new Employee(108, "Rahul", 28));
		list.add(new Employee(104, "Ayush", 35));
		
		System.out.println("With out sorting data ");
		System.out.println(list);
		System.out.println("----------------------------");
		Collections.sort(list, new Employee());// old way
		System.out.println("Sorted data ");
		System.out.println(list);
	}
}
