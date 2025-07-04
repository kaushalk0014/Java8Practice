package com.learning.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortUsingComparable  {

	 
	public static void main(String[] args) {
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(101, "Kaushal", 25));
		list.add(new Employee(105, "Pankaj", 32));
		list.add(new Employee(108, "Rahul", 28));
		list.add(new Employee(104, "Ayush", 35));
		
		 System.out.println(list);
		 
		 System.out.println("\n After sorting-------------");
		 Collections.sort(list);
		 System.out.println(list);
		 System.out.println("---------------------------------");
		 //SortUsingComparable.sordData();
	}
	
	public void sordData() {

		//we can't sort data using Comparable because comparable using this key word
		List<Customer> list= new ArrayList<Customer>();
		list.add(new Customer(101, "Kaushal", 25));
		list.add(new Customer(105, "Pankaj", 32));
		list.add(new Customer(108, "Rahul", 28));
		list.add(new Customer(104, "Ayush", 35));
		
		Comparable<Customer> comparable =  new Comparable<Customer>() {
			
			@Override
			public int compareTo(Customer o) {
				 //Integer.compare(this, 0);
				return 0;
			}
		};
		
	}
}
