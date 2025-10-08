package com.revision.data.solid.d;

public class Car {
	// Car depends on the Engine interface, not a specific engine type

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.start();
	}

}
