package com.sort.list.custome;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeDataDesOrder {

	public static void main(String[] args) {
		List<Employee> list = GetEmployeeList.getEmpList();

		System.out.println(list);

		System.out.println("---------Step : 1------------");

		System.out.println("Sort list data by employee name using list.sort()");
		list.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		list.stream().forEach(System.out::println);

		System.out.println("\n---------Step : 2------------");
		System.out.println("Sort list data by employee gender using Collections.sort()");
		List<Employee> list2 = GetEmployeeList.getEmpList();
		Collections.sort(list2, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getGender().compareTo(o1.getGender());
			}
		});

		list2.stream().forEach(System.out::println);

		System.out.println("\n---------Step : 2------------");
		System.out.println("Sort list data by employee salary using Collections.sort()");
		List<Employee> list3 = GetEmployeeList.getEmpList();
		Collections.sort(list3, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
		});
		list3.stream().forEach(System.out::println);

		System.out.println("\n---------Step : 3------------");
		System.out.println("Sort list data by employee name using Lambda");
		List<Employee> list4 = GetEmployeeList.getEmpList();
		Collections.sort(list4, (o1, o2)-> o2.getName().compareTo(o1.getName()) );

		list4.stream().forEach(System.out::println);
		
		
	}

}
