package com.revision.flatmap;

import com.learning.employee.dao.GetEmployeeList;

public class ExampleOfFlatMap {

	public static void main(String[] args) {
		GetEmployeeList.getEmpList().stream()
		.flatMap(e->e.getProjects().stream())
		.toList()
		.forEach(System.out::println);
	}
}
