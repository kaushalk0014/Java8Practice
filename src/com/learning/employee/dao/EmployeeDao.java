package com.learning.employee.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeDao {
	
	
	public static Optional<List<Employee>> getEmployees(){
		List<Employee> list=Arrays.asList(new Employee(101, "Pankaj", "Developer", 500000),
				new Employee(104, "Rahul", "HR", 800000),
				new Employee(103, "Dinesh", "Manager", 900000),
				new Employee(106, "Sagar", "Developer", 400000),
				new Employee(105, "Rohan", "HRr", 300000));
		
		return Optional.of(list);
	}
}
