package com.learning.clone.without;

public class DeepCloningExample {
	public static void main(String[] args) {
		// Create an Address object
		Address address = new Address();
		address.setStreet("123 Main St");
		address.setCity("Delhi");
		address.setState("IL");
		address.setZipCode("62701");

		// Create an Employee object
		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setAge(30);
		employee.setAddress(address);

		System.out.println("Original Employee: " + employee);
		System.out.println("Original Address: " + employee.getAddress());
		
		Address copyAddress = employee.getAddress();
		copyAddress.setCity("Bangalore");
		System.out.println("Original Address: " + employee.getAddress());
		// Perform deep cloning

		Employee clonedEmployee = employee;
		clonedEmployee.setAge(55);
		
		System.out.println("Cloned Employee: " + clonedEmployee);
		
	}
	
	
}
