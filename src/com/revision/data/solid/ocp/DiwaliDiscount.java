package com.revision.data.solid.ocp;

public class DiwaliDiscount implements DiscountStrategy{

	@Override
	public double applyDiscount(double price) {
		return price*0.5;
	}
}
