package com.example.groupby;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Alice", "HR", 5000), new Employee("Bob", "IT", 7000),
				new Employee("Charlie", "IT", 8000), new Employee("David", "HR", 4500),
				new Employee("Eve", "Finance", 6000), new Employee("Frank", "Finance", 5000));

		Map<String, List<Employee>> groupBy = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));

		// Group by department name
		System.out.println(groupBy);

		// Group by department name and display only unique salary

		Map<Integer, Set<Employee>> groupBy2 = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getSalary(), Collectors.toSet()));

		System.out.println("\n");
		System.out.println(groupBy2);

		// Group by department name and display only unique salary and sort data

		System.out.println("\n");
		Map<Integer, Set<Employee>> groupMap = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getSalary(), TreeMap::new, Collectors.toSet()));

		System.out.println(groupMap);

		// Group by department name and display only unique salary and sort data
		// descending

		Map<Integer, Set<Employee>> groupMap2 = employees.stream().collect(Collectors.groupingBy(emp -> emp.getSalary(),
				() -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toSet()));

		System.out.println("\n");
		System.out.println(groupMap2);
	}
}
