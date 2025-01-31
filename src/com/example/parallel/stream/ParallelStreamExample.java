package com.example.parallel.stream;

import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
	
		long start=0;
		long end=0;
		
		List<Employee> list=GetEmployeeList.getEmpList();
		
		start=System.currentTimeMillis();
		double salaryStream=list.stream().map(emp->emp.getSalary()).mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Using Stream : "+salaryStream+"   :   "+ (end-start));
		
		
		start=System.currentTimeMillis();
		double salaryParallel= list.parallelStream().map(emp->emp.getSalary()).mapToDouble(s->s).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Using Paraller Stream : "+salaryParallel+"   :  "+ (end-start));
	
	}
}
