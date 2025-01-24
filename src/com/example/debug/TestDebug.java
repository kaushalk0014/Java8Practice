package com.example.debug;

import java.util.List;
import java.util.stream.Collectors;

import com.example.sort.list.custome.Employee;
import com.example.sort.list.custome.GetEmployeeList;

public class TestDebug {

	public static void main(String[] args) {
		List<Employee> list=GetEmployeeList.getEmpList();
		
		
		List<Double> listData=list.stream()
			.filter(emp->emp.getDept().equals("Development"))
			.peek(data->System.out.println("Step 1 : "+data))
			.sorted((emp1,emp2)-> emp1.getName().compareTo(emp2.getName()))
			.peek(data->System.out.println("Step 2 : "+data))
			.map(sal->sal.getSalary()).collect(Collectors.toList());
		
		System.out.println(listData);
	}
}
