package com.example.immutable;

public final class ImmutableClass {
	
	private final Integer integer;

	public ImmutableClass(Integer value) {
		this.integer = value;
	}

	public Integer getInteger() {
		return integer;
	}

	@Override
	public String toString() {
		return "ImmutableClass [integer=" + integer + "]";
	}

}
