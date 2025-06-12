package com.learning.filter;

import java.util.List;

import com.learning.employee.dao.Employee;
import com.learning.employee.dao.GetEmployeeList;

public class FilterData {

	public static void main(String[] args) {
		List<Employee> list = GetEmployeeList.getEmpList();
		long count= list.stream().filter(emp->"HR".equalsIgnoreCase(emp.getDept())).count();
		System.out.println(count);
		
		List<Employee> result =list.stream().filter(emp->emp.getSalary()<70000).toList();
		System.out.println(result);
		List<Employee> result1 =list.stream().filter(emp->emp.getSalary()<70000)
		.map(emp->{
			emp.setSalary(emp.getSalary()*1.10);
			return emp;
		}).toList();
		
		System.out.println(result1);
		
		System.out.println(100*1.50);
		
	}
}
