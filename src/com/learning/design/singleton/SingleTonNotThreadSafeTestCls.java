package com.learning.design.singleton;

public class SingleTonNotThreadSafeTestCls implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method : "+ Thread.currentThread().getName());
		System.out.println("Run method : "+ SingleTonNotThreadSafe.getInstance());
		
	}
	public static void main(String[] args) {
		
		Thread th=new Thread(new SingleTonNotThreadSafeTestCls());
		th.start();
		
		System.out.println("Run method : "+ Thread.currentThread().getName());
		System.out.println("Run method : "+ SingleTonNotThreadSafe.getInstance());
	}
}
