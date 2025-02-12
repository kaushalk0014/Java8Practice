package com.example.thread;

public class PrintEvenAndOdd implements Runnable {

	static int count = 0;

	private Object obj;

	public PrintEvenAndOdd(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while (count <= 10) {
			if (count % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
				synchronized (obj) {
					System.out.println("Thread Name : " + Thread.currentThread().getName() + ",  Value : " + count);
					count++;
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (obj) {
					System.out.println(" Thread Name : " + Thread.currentThread().getName() + ",  Value : " + count);
					count++;
					
					obj.notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		Object obj= new Object();
		Runnable runEven= new PrintEvenAndOdd(obj);
		Runnable runOdd= new PrintEvenAndOdd(obj);
		new Thread(runEven, "Even").start();
		new Thread(runOdd, "odd").start();
	}
}
