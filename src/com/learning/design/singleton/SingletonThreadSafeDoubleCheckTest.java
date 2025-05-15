package com.learning.design.singleton;

public class SingletonThreadSafeDoubleCheckTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method : "+ Thread.currentThread().getName());
		System.out.println("Run method : "+ SingletonThreadSafeDoubleCheck.getInstance());
		
	}
	public static void main(String[] args) {
		
		Thread th=new Thread(new SingletonThreadSafeDoubleCheckTest());
		th.start();
		
		System.out.println("Run method : "+ Thread.currentThread().getName());
		System.out.println("Run method : "+ SingletonThreadSafeDoubleCheck.getInstance());
	}
}
