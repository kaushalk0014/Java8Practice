package com.revision.clone;

import java.util.Date;
import java.util.List;

public class Employee implements Cloneable {

	private String name;
	private Date dof;
	private List<String> mobile;
	private Address address;

	public Employee() {
	}
	
	public Employee(String name, Date dof, List<String> mobile, Address address) {
		super();
		this.name = name;
		this.dof = dof;
		this.mobile = mobile;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDof() {
		return dof;
	}

	public void setDof(Date dof) {
		this.dof = dof;
	}

	public List<String> getMobile() {
		return mobile;
	}

	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		try {
			return (Employee) super.clone();
		}catch (Exception e) {
			throw new RuntimeException("Clone not support");
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dof=" + dof + ", mobile=" + mobile + ", address=" + address + "]";
	}

	
}
