package com.revision.data.dao.customer;

import java.util.Map;

public class CustomerMapData {

	public static Map<Integer, Customer> getAllData() {

		return Map.of(101, new Customer(101, "Kaushal"), 
				205, new Customer(205, "Mohan"), 
				208, new Customer(208, "Rakesh"), 
				203, new Customer(203, "Akash"), 
				180, new Customer(180, "Pankaj"));
	}
}
