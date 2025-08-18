package com.learning.immutable.custom;

import java.util.Date;

public class CustomImmutableDateSolution {

	private final Date date;
	
	
	public CustomImmutableDateSolution(Date date) {
		// Create a defensive copy of the date to ensure immutability
		this.date = new Date(date.getTime());
	}
	
	public Date getDate() {
		// Return a defensive copy of the date to ensure immutability
		return new Date(date.getTime());
	}

}
