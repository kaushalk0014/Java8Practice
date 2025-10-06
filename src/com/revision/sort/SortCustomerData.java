package com.revision.sort;

import java.util.Comparator;
import java.util.List;

import com.revision.data.dao.customer.Customer;
import com.revision.data.dao.customer.CustomerListData;

public class SortCustomerData {
	
	public static void main(String[] args) {
		List<Customer> list = CustomerListData.getAllGet()
		.stream().sorted(Comparator.comparing(Customer::getId)).toList();
		
		
		System.out.println(list);
		System.out.println("reverse order");
		//-----------------------
		// reverse order
		
		List<Customer> reverseData= CustomerListData.getAllGet()
		.stream().sorted(Comparator.comparing(Customer::getId, Comparator.reverseOrder())).toList();
		
		System.out.println(reverseData);
		
		
	}
}
