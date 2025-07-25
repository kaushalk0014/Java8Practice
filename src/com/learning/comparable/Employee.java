package com.learning.comparable;

public class Employee implements Comparable<Employee>{

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

//	@Override
//	public int compareTo(Employee o) {
//		return Integer.compare(this.id, o.getId());
//		
//	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
		
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
