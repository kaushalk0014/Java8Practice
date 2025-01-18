package com.sort.list;

import java.util.Arrays;
import java.util.List;

public class GetEmployeeList {

	private static List<Employee> getEmpList() {
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

class Employee {
	private int id;
	private String name;
	private String dept;
	private List<Project> projects;
	private double salary;
	private String gender;
	
	public Employee() {
	}
	
	
	public Employee(int id, String name, String dept, List<Project> projects, double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.projects = projects;
		this.salary = salary;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public List<Project> getProjects() {
		return projects;
	}



	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", projects=" + projects + ", salary="
				+ salary + ", gender=" + gender + "]";
	}

	
}

class Project {

	private String projectCode;
	private String name;
	private String client;
	private String buLeadName;
	
	
	public Project(String projectCode, String name, String client, String buLeadName) {
		super();
		this.projectCode = projectCode;
		this.name = name;
		this.client = client;
		this.buLeadName = buLeadName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getBuLeadName() {
		return buLeadName;
	}
	public void setBuLeadName(String buLeadName) {
		this.buLeadName = buLeadName;
	}
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", name=" + name + ", client=" + client + ", buLeadName="
				+ buLeadName + "]";
	}
	
	
}