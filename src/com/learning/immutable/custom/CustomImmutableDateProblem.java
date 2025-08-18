package com.learning.immutable.custom;

import java.util.Date;

public class CustomImmutableDateProblem {
	private final Date date;
	
	
	public CustomImmutableDateProblem(Date date) {
		// Create a defensive copy of the date to ensure immutability
		this.date = new Date(date.getTime());
	}
	
	public Date getDate() {
		return date;
	}
}
