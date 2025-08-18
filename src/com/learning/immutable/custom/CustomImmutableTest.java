package com.learning.immutable.custom;

import java.util.List;

public class CustomImmutableTest {
	public static void main(String[] args) {
		// Create an instance of CustomImmutable
		CustomImmutable customImmutable = new CustomImmutable("Pankaj Kumar", 
				List.of("Spring", "Java", "Hibernate"));
		
		// Access the name using the getter method
		System.out.println("Name: " + customImmutable.getName());
		System.out.println("Languages: " + customImmutable.getLanguages());
		
		// Attempting to modify the name will not work because the class is immutable
		// name property is not visible outside the class and there is no setter method
		 //customImmutable.name = "Rahul Kumar"; // This line would cause a compilation error
		// Attempting to modify the languages list will not work because it is immutable
		
		List<String>  languages= customImmutable.getLanguages();
		// This line will throw UnsupportedOperationException
		
		//languages.add("JavaScript"); // This line would cause a runtime exception
		
		// The object remains unchanged
		System.out.println("Unchanged Name: " + customImmutable.getName());
	}
}
