package com.revision.data.solid.ocp;

public class NewYearsDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double price) {
		return price*0.8;
	}
}
