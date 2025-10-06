package com.revision.data.dao.customer;

import java.util.List;


public class CustomerListData {

	public static List<Customer> getAllGet() {
		
		return List.of(new Customer(101, "Kaushal"),
				new Customer(150, "Kaushal"),
				new Customer(205, "Mohan"),
				new Customer(208, "Rakesh"),
				new Customer(203, "Akash"),
				new Customer(180, "Pankaj"));

	}
	
}
 