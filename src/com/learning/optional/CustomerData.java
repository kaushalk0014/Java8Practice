package com.learning.optional;

import java.util.Arrays;
import java.util.List;

public class CustomerData {

	public static List<Customer> getAllCustomer() {
		return Arrays.asList(
				new Customer(101, "Rahul", "rahul@gmail.com", Arrays.asList("Java", "Spring")),
				new Customer(101, "Pankaj", "pankaj@gmail.com", Arrays.asList("JavaScript", "Spring Boot")),
				new Customer(101, "Joy", "joy@gmail.com", Arrays.asList("React", "THMl")));
	}
}

class Customer {
	private Integer id;
	private String name;
	private String email;
	private List<String> skills;

	public Customer() {
	}

	public Customer(Integer id, String name, String email, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", skills=" + skills + "]";
	}

}
