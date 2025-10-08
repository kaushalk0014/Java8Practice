package com.revision.data.solid.i;

public class FlyingCar implements Drivable, Flyable {

	@Override
	public void drive() {
		 System.out.println("Flying car driving");
	}

	@Override
	public void fly() {
		System.out.println("Flying car flying");
	}
}
