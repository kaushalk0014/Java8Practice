package com.learning.design.singleton;

public class TestSingletonThreadSafe implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Run method : "+SingleTon.getInstance());
		System.out.println("Run method : "+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		System.out.println(SingleTon.getInstance());
		TestSingletonThreadSafe safe=new TestSingletonThreadSafe();
		Thread t1=new Thread(safe);
		t1.start();
		System.out.println("Main method : "+Thread.currentThread().getName());
		
	}
}
