package com.learning.immutable.custom;

import java.util.Date;

public class CustomImmutableDateProblemTest {
	
	public static void main(String[] args) {
		// Create an instance of CustomImmutableDate
		CustomImmutableDateProblem immutableDate = new CustomImmutableDateProblem(new Date());
		
		// Get the date from the immutable object
		Date date = immutableDate.getDate();
		
		// Print the date
		System.out.println("Original Date: " + date);
		
		// Attempt to modify the date (this won't affect the original immutable object)
		date.setTime(0);
		
		// Print the date again to show that it hasn't changed in the immutable object
		System.out.println("Modified Date: " + immutableDate.getDate());
	}
}
