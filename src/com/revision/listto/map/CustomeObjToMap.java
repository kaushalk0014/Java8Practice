package com.revision.listto.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomeObjToMap {

	public static void main(String[] args) {
		List<Customer> list = List.of(new Customer(101, "Kaushal"),
				new Customer(150, "Kaushal"),
				new Customer(205, "Mohan"),
				new Customer(208, "Rakesh"),
				new Customer(203, "Akash"),
				new Customer(180, "Pankaj"));
		
		Map<Integer, List<Customer>> map = list.stream().collect(Collectors.groupingBy(m->m.getId()));
		 
		System.out.println(map);
	}
}
