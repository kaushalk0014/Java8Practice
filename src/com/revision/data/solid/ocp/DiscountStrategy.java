package com.revision.data.solid.ocp;

public interface DiscountStrategy {

	/*
	 * 2. O – Open/Closed Principle (OCP) Software entities should be open for
	 * extension, but closed for modification.
	 * 
	 */
	
	public double applyDiscount(double price);
}
