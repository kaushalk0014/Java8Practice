package com.learning.nthhighest;

import java.util.Arrays;
import java.util.List;

public class FindNthHighestSalary {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("Kaushal", 5000), new Employee("Dipak", 8000),
				new Employee("Pankaj", 4000), new Employee("Rojan", 12000));

		List<Employee> result = list.stream().filter(emp -> emp.getSalary() > 10000).toList();

		result.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("Find nth highest salary");
		System.out.println(findNthHighestSalary(3, list));

	}

	private static Employee findNthHighestSalary(int nth, List<Employee> list) {
		return list.stream().sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary())).skip(nth - 1).findFirst()
				.orElse(new Employee());

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
