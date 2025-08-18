package com.learning.immutable.custom;

import java.util.List;

public final class CustomImmutable {
	
	private final String name;
	
	private final List<String> languages;
	
	public CustomImmutable(String name, List<String> languages) {
		this.name = name;
		this.languages = List.copyOf(languages); 
		// Using List.copyOf to create an immutable copy of the list
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getLanguages() {
		return languages;
	}
}
