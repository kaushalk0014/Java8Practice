package com.example.collections;

import java.util.Arrays;
import java.util.List;

public class GetListEmployee {

	public static List<Employee> getList(){
			return 
					Arrays.asList(new Employee("Roohan",5000),
							new Employee("Pawan",5000),
							new Employee("Akash",8000),
							new Employee("Chandan",9000));
	}
	
}
