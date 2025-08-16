package com.learning.clone;

import java.util.List;

public class Employee implements Cloneable {

	private String name;
	private int age;
	private Address address;
	private List<String> skills;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", skills=" + skills + "]";
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		try {
			Employee cloned= (Employee) super.clone();
			cloned.setAddress(address.clone()); // Deep clone the address
			return cloned;
		}catch (CloneNotSupportedException e) {
			throw new CloneNotSupportedException("Cloning not supported for Employee class");
		}
	}
	
}
