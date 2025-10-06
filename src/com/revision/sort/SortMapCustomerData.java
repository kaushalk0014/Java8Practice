package com.revision.sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.revision.data.dao.customer.Customer;
import com.revision.data.dao.customer.CustomerMapData;

public class SortMapCustomerData {

	public static void main(String[] args) {
		
		Map<Integer, Customer> map = CustomerMapData.getAllData()
		.entrySet().stream().sorted((o1, o2)->o1.getKey().compareTo(o2.getKey()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap:: new));
		
		System.out.println(map);
	}
}
