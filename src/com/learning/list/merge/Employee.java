package com.learning.list.merge;

public class Employee {

	private Integer id;
	private String name;
	private String pincode;
	private String state;

	public Employee() {
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}

}
