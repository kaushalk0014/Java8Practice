package com.learning.list.merge;

public class Address {

	private Integer addressId;
	private Integer empId;
	private String pincode;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer addressId, Integer empId, String pincode, String state) {
		super();
		this.addressId = addressId;
		this.empId = empId;
		this.pincode = pincode;
		this.state = state;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

}
