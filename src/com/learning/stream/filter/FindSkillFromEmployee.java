package com.learning.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSkillFromEmployee {

	public static void main(String[] args) {

		List<String> skills = Arrays.asList("Spring", "Java");
		List<Employee> result = filterEmployeeList(skills).orElseGet(ArrayList::new);
		System.out.println(result);
		
		learnOptional();
	}
	
	public static void learnOptional() {
		System.out.println("------------Example-1--------");
		List<String> skills = Arrays.asList("Splunk");
		Optional<List<Employee>> result =filterEmployeeList(skills);
		System.out.println("Result Optional.of : "+result.get());
		
		Optional<List<Employee>> result2 =optionalOfNullable(skills);
		System.out.println("Result Optional.ofNullable : "+result2.get());
		
	}

	public static Optional<List<Employee>> optionalOfNullable(List<String> skills) {
		List<Employee> empsList = Arrays.asList(new Employee(101, "kaushal", Arrays.asList("UI", "React", "Java")),
				new Employee(102, "Santosh", Arrays.asList("Spring", "HTML", "JPA")));
		
		List<Employee> filterSesult= empsList.stream()
		.filter(emp-> emp.getSkills().stream().anyMatch(skills::contains))
		.toList();
		return Optional.ofNullable(filterSesult);
	}
	
	public static Optional<List<Employee>> filterEmployeeList(List<String> skills) {
		List<Employee> empsList = Arrays.asList(new Employee(101, "kaushal", Arrays.asList("UI", "React", "Java")),
				new Employee(102, "Santosh", Arrays.asList("Spring", "HTML", "JPA")));
		
		List<Employee> filterSesult= empsList.stream()
		.filter(emp-> emp.getSkills().stream().anyMatch(skills::contains))
		.toList();
		return Optional.of(filterSesult);
	}
}

class Employee {
	private Integer id;
	private String name;

	private List<String> skills;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}
}
