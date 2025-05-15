package com.learning.groupby;

import java.util.Arrays;
import java.util.List;

public class GetEmployeeList {

	public static List<Employee> getEmpList() {
		Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
		Project p2 = new Project("P002", "Beta", "XYZ Ltd", "Bob");
		Project p3 = new Project("P003", "Gamma", "ABC Corp", "Alice");
		Project p4 = new Project("P004", "Delta", "TechWorld", "Charlie");
		Project p5 = new Project("P005", "Epsilon", "MoneyMatters", "Daniel");
		Project p6 = new Project("P006", "Zeta", "SmartTech", "Eva");
		Project p7 = new Project("P007", "Eta", "BrandBoost", "George");
		Project p8 = new Project("P008", "Theta", "InnoSoft", "Hannah");
		Project p9 = new Project("P009", "Iota", "FastTrack", "Ian");
		Project p10 = new Project("P010", "Kappa", "DigitalWave", "Jessica");

		// Employee instances
		Employee e1 = new Employee(101, "Rakesh", "Development", Arrays.asList(p1, p2), 80000, "Male");
		Employee e2 = new Employee(102, "Pankaj", "Development", Arrays.asList(p3), 80000, "Male");
		Employee e3 = new Employee(103, "Rohan", "Sales", Arrays.asList(p4), 60000, "Male");
		Employee e4 = new Employee(104, "Raju", "HR", Arrays.asList(p1), 55000, "Male");
		Employee e5 = new Employee(105, "Akash", "Finance", Arrays.asList(p5), 90000, "Male");
		Employee e6 = new Employee(106, "Shivani", "Development", Arrays.asList(p6), 85000, "Female");
		Employee e7 = new Employee(107, "Saurav", "Marketing", Arrays.asList(p7), 72000, "Male");
		Employee e8 = new Employee(108, "Pankaj", "Development", Arrays.asList(p8), 88000, "Male");
		Employee e9 = new Employee(109, "Dasrath", "Sales", Arrays.asList(p9), 78000, "Male");
		Employee e10 = new Employee(121, "Deepika", "Development", Arrays.asList(p10), 95000, "Female");

		return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
	}
}
