package com.sort.list.custome;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeDataUsingStream {

	public static void main(String[] args) {
		List<Employee> list = GetEmployeeList.getEmpList();

		System.out.println(list);

		System.out.println("\n---------Step : 1------------");

		System.out.println("Ascending Order Sort list data by employee name using stream().sorted()");

		Comparator<Employee> compare = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		List<Employee> listOut = list.stream().sorted(compare).collect(Collectors.toList());
		listOut.forEach(System.out::println);

		System.out.println("\n---------Step : 1------------");
		System.out.println("Descending Order Sort list data by employee name using stream().sorted()");

		Comparator<Employee> compare2 = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};

		List<Employee> listOut2 = list.stream().sorted(compare2).collect(Collectors.toList());
		listOut2.forEach(System.out::println);

		System.out.println("\n---------Step : 2------------");

		System.out.println("Descending Order Sort list data by employee name using stream().sorted(reversed())");

		Comparator<Employee> compare3 = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		List<Employee> listOut3 = list.stream().sorted(compare3.reversed()).collect(Collectors.toList());
		listOut3.forEach(System.out::println);

		System.out.println("\n---------Step : 3------------");

		System.out.println("Ascending Order Sort list data by employee name using stream().sorted(reversed())");

		list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
		
		System.out.println("\n---------Step : 3------------");

		System.out.println("Descending Order Sort list data by employee name using stream().sorted(reversed())");

		list.stream().sorted((o1,o2)->o2.getName().compareTo(o1.getName()))
		.forEach(System.out::println);
		
		System.out.println("\n---------Step : 4------------");

		System.out.println("Descending Order Sort list data by employee name using stream().sorted(reversed())");

		list.stream().sorted((o1,o2)->o2.getName().compareTo(o1.getName()))
		.forEach(System.out::println);
		
		System.out.println("\n---------Step : 5------------");

		System.out.println("Descending Order Sort list data by employee salary using stream().sorted(reversed())");

		list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
		System.out.println("\n---------Step : 5------------");

		System.out.println("Ascending Order Sort list data by employee name using stream().sorted()");

		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
	}
}
