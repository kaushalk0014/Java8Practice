package com.learning.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		List<Employee> list=GetEmployeeList.getEmpList();
		
		Map<String, List<Employee>> empByDept = list.stream()
		.collect(Collectors.groupingBy(Employee::getDept));
		
		empByDept.forEach((k,v)->{
			System.out.println("key : "+k +"   Value : "+ v);
		});
		//System.out.println(empByDept);
		 
	}
	
}
