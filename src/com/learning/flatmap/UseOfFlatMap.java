package com.learning.flatmap;

import java.util.List;
import java.util.stream.Collectors;

import com.learning.employee.dao.Employee;
import com.learning.employee.dao.GetEmployeeList;
import com.learning.employee.dao.Project;

public class UseOfFlatMap {

	public static void main(String[] args) {
		List<Employee> list=GetEmployeeList.getEmpList();
		
		 List<Project> result =list
				 .stream().flatMap(m->m.getProjects().stream()).collect(Collectors.toList());
		 
		 System.out.println(result);
		 System.out.println("Result Size : "+ result.size());
		 System.out.println("---------------------");
		 List<Project> result2 =list
				 .stream().flatMap(m->m.getProjects().stream())
				 .distinct()
				 .collect(Collectors.toList());
		 
		 System.out.println(result2);
		 System.out.println("Result Size : "+ result2.size());
	}
}
