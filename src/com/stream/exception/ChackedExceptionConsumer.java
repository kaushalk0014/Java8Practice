package com.stream.exception;

@FunctionalInterface
public interface ChackedExceptionConsumer <Target, ExObj extends Exception>{

	void accept(Target target) throws ExObj; 
	
}
