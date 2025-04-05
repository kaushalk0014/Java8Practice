package com.learning.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Date> {

	@Override
	public Date get() {
		return new Date();
	}

	public static void main(String[] args) {
		Supplier<Date> supplier = () -> {
			return new Date();
		};

		System.out.println("Get Result :" + supplier.get());
	}
}
