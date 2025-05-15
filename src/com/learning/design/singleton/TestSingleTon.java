package com.learning.design.singleton;

public class TestSingleTon {

	public static void main(String[] args) {
		SingleTon singleTon= SingleTon.getInstance();
		
		System.out.println(singleTon);
	}
}
