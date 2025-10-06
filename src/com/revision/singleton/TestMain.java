package com.revision.singleton;

public class TestMain {

	public static void main(String[] args) {
		SingleTon singleTon =SingleTon.getInstance();
		SingleTon singleTons =SingleTon.getInstance();
		
		System.out.println(singleTon);
	}
}
