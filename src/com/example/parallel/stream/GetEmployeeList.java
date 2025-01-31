package com.example.parallel.stream;

import java.util.Arrays;
import java.util.List;

public class GetEmployeeList {

	public static List<Employee> getEmpList() {
		Employee e1 = new Employee(101, "Rakesh", "Development",  80000);
		Employee e2 = new Employee(102, "Pankaj", "Development",  80000 );
		Employee e3 = new Employee(103, "Rohan", "Sales", 60000 );
		Employee e4 = new Employee(104, "Raju", "HR", 55000);
		Employee e5 = new Employee(105, "Akash", "Finance", 90000);
		Employee e6 = new Employee(106, "Shivani", "Development",  85000 );
		Employee e7 = new Employee(107, "Saurav", "Marketing", 72000);
		Employee e8 = new Employee(108, "Pankaj", "Development", 88000);
		Employee e9 = new Employee(109, "Dasrath", "Sales", 78000);
		Employee e10 = new Employee(121, "Deepika", "Development", 95000 );

		return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
	}
}
