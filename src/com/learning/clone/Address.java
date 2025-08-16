package com.learning.clone;

public class Address implements Cloneable {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	 @Override
	protected Address clone() throws CloneNotSupportedException {
		try {
			return (Address) super.clone();
		}catch(CloneNotSupportedException e) {
			throw new CloneNotSupportedException("Cloning not supported for Address class");
		}
	}

	 @Override
	 public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	 }
	
}
