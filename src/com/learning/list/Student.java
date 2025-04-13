package com.learning.list;

import java.util.List;

public class Student {

	private Integer id;
	private String name;
	private String gender;
	private Integer age;
	private String dept;
	private String city;
	private Integer rank;
	private List<String> phones;

	public Student() {
	}

	public Student(Integer id, String name, String gender, Integer age, String dept, String city, Integer rank,
			List<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dept = dept;
		this.city = city;
		this.rank = rank;
		this.phones = phones;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", dept=" + dept
				+ ", city=" + city + ", rank=" + rank + ", phones=" + phones + "]";
	}

}
