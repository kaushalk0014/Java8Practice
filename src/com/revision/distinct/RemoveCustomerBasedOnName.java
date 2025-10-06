package com.revision.distinct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.revision.data.dao.customer.Customer;
import com.revision.data.dao.customer.CustomerListData;

public class RemoveCustomerBasedOnName {

	public static void main(String[] args) {
		/*
		 * Remove duplicates based on a specific field (e.g., name in Customer), but
		 * don’t want to override equals(), how would you do it?
		 * 
		 */
		//5+4 = 9
		List<Customer> list = new ArrayList<Customer>(CustomerListData.getAllGet());
		list.add(new Customer(150, "Kaushal"));
		list.add(new Customer(205, "Mohan"));
		list.add(new Customer(203, "Akash"));
		
		System.out.println(list);
		System.out.println("Size : "+ list.size());//9
		
		System.out.println();
		
		List<Customer> customerlist =
		list.stream()
		.collect(Collectors.collectingAndThen(Collectors
				.toCollection(()-> new TreeSet<Customer>(Comparator.comparing(Customer::getName))),
				ArrayList:: new));
		
		System.out.println(customerlist);
		System.out.println("Size : "+ customerlist.size());
		
		System.out.println("---------------------");
		
		list.stream().collect(Collectors.toMap(Customer::getName,Function.identity(),
				(c1, c2)-> c1, LinkedHashMap:: new));

	}
}
