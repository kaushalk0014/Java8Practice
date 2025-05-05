package com.learning.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExampleOptional {

	private static void getCustomerByEmail(String email) {
		System.out.println("---------getCustomerByEmail--------------");
		
//		Customer result=CustomerData.getAllCustomer()
//				.stream().filter(cus->cus.getEmail().equalsIgnoreCase(email))
//				.findAny().get();
		
//		Customer result=CustomerData.getAllCustomer()
//		.stream().filter(cus->cus.getEmail().equalsIgnoreCase(email))
//		.findAny().orElse(new Customer());
		
		
		Customer result=CustomerData.getAllCustomer()
				.stream().filter(cus->cus.getEmail().equalsIgnoreCase(email))
				.findAny().orElse(new Customer());
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		getCustomerByEmail("python");
		/*
		 * To create optional class object we we have few bay
		 * 
		 * Optional.empty();
		 * Optional.of()
		 * Optional.ofNullable()
		 */
		Employee employee=new Employee(101, "Pankaj", null, Arrays.asList("Spring", "Java"));
		Optional<Object> optional = Optional.empty();
		System.out.println(optional);

		//Optional<String> optionalOf = Optional.of(employee.getEmail());
		//System.out.println(optionalOf);
		/*
		 * Optional.of internally checking null if value passing null in Optional.of then It will throw null pointer exception
		 */
		
		Optional<String> optionalOfNullable=Optional.ofNullable(employee.getEmail());
		
		/*
		 * if(optionalOfNullable.isPresent()) {
		 * 		System.out.println(optionalOfNullable.get()); 
		 * }
		 */
		
		//System.out.println(optionalOfNullable.orElse("example@gmail.com"));
		
		//System.out.println(optionalOfNullable.orElseGet(()->"example@gmail.com"));
		
		//System.out.println(optionalOfNullable.orElseThrow(()-> new IllegalArgumentException("email id is not present")));
		
		System.out.println(optionalOfNullable.map(String::toUpperCase).orElse("example@gmailcom"));
		System.out.println(optionalOfNullable.map(str->str.toUpperCase()).orElse("example@gmailcom"));
		
	}
}

class Employee {
	private Integer id;
	private String name;
	private String email;
	private List<String> skills;

	public Employee() {
	}

	public Employee(Integer id, String name, String email, List<String> skills) {
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
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", skills=" + skills + "]";
	}

}
