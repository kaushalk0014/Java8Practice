package com.revision.filter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.employee.dao.Employee;
import com.learning.employee.dao.GetEmployeeList;
import com.learning.employee.dao.Project;

public class FilterData {

	public static void main(String[] args) {
		List<Employee> list = GetEmployeeList.getEmpList();
		
		list.forEach(System.out::println);
		System.out.println("\n Filter Data based on gender");
		
		list.stream().filter(e->e.getGender().equalsIgnoreCase("male"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("\n Increage all employee salary by 10%");
		
		list.stream().map(m->{
			m.setSalary(m.getSalary()*1.10);
			return m;
		}).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("\n Use of flat map");
		
	 	List<Project> projects = list.stream().flatMap(l-> l.getProjects().stream()).collect(Collectors.toList());
		
	 	projects.forEach(System.out::println);
	 	
	 	System.out.println("\n Sort Employee data");
	 	
	 	GetEmployeeList.getEmpList().stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName()))
	 	.collect(Collectors.toList())
	 	.forEach(System.out::println);
	 	
		System.out.println("\n Sort Employee data 2");
		
		GetEmployeeList.getEmpList().stream().sorted(Comparator.comparing(Employee::getId))
		.toList()
		.forEach(System.out::println);
	}
}
