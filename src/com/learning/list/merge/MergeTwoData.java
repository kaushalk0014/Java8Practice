package com.learning.list.merge;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MergeTwoData {

	public static void main(String[] args) {
		
		List<Employee> listEmployee= List.of(new Employee(101, "kaushal"),
				new Employee(102, "Pankaj"),
				new Employee(103, "Rakesh"),
				new Employee(104, "Ayush"));
		
		
		List<Address> listAddress = List.of(new Address(1001, 101, "845612", "Delhi"),
											new Address(1002, 102, "665235", "Bihar"),
											new Address(1004, 104, "774411", "HYD")
											); 
		
		Map<Integer, Address> mapAddress= listAddress.stream()
				.collect(Collectors.toMap(Address::getEmpId, Function.identity()));
		
		List<Employee> result = listEmployee.stream().map(emp->{
			Address address = mapAddress.get(emp.getId());
			if(address!=null) {
				emp.setPincode(address.getPincode());
				emp.setState(address.getState());
			}
			return emp;
		}).collect(Collectors.toList());
		
		System.out.println(result);
	}
	
}
