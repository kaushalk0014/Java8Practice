package com.revision.nthhighest;

import java.util.Arrays;
import java.util.List;


public class FindNthHighestSalaryOfEmployee {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Kaushal", 5000), new Employee("Dipak", 8000),
				new Employee("Pankaj", 4000), new Employee("Rojan", 12000));
	
		findNthHighestSamaryEmployee(1, list);
	}
	
	public static void findNthHighestSamaryEmployee(int nth, List<Employee> list) {
	
		Employee employee = list.stream()
		.sorted((e1, e2)-> e2.getSalary().compareTo(e1.getSalary()))
		//.peek(System.out::println)
		.skip(nth-1).findFirst().orElse(new Employee());
		
		System.out.println(employee);
	} 
}

class Employee {
	private String name;
	private Integer salary;

	public Employee() {
	}

	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
