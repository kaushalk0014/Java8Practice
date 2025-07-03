package com.learning.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustomerData {

	public static void main(String[] args) {
		

		List<Customer> list= new ArrayList<Customer>();
		list.add(new Customer(101, "Kaushal", 25));
		list.add(new Customer(105, "Pankaj", 32));
		list.add(new Customer(108, "Rahul", 28));
		list.add(new Customer(104, "Ayush", 35));
		
		System.out.println("With out sorting data ");
		System.out.println(list);
		System.out.println("----------------------------");
		
		Collections.sort(list, new Comparator<Customer>() {
				
			@Override
			public int compare(Customer o1, Customer o2) {
				 
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});
		
		System.out.println("---------------------------------");
		System.out.println("Sorted data ");
		System.out.println(list);
	}
	
}
