package com.learning.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	private Integer id;
	private String name;
	private Integer age;

	public Employee() {
	}

	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getId(), o2.getId());
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
