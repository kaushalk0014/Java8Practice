package com.revision.distinct;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.revision.data.dao.customer.Customer;
import com.revision.data.dao.customer.CustomerListData;

public class CustomPredicate {

	public static void main(String[] args) {
		/*
		 * Using a Custom Predicate with filter() If you want more control or to filter
		 * by multiple fields
		 * 
		 */

		// 5+4 = 9
		List<Customer> list = new ArrayList<Customer>(CustomerListData.getAllGet());
		list.add(new Customer(150, "Kaushal"));
		list.add(new Customer(205, "Mohan"));
		list.add(new Customer(203, "Akash"));
		
		Set<String> names= new HashSet<String>();
		
		List<Customer> customerList = 
		list.stream().filter(c->names.add(c.getName())).collect(Collectors.toList());
		
		System.out.println(customerList);
		System.out.println("Size : "+ customerList.size());
	}
}
