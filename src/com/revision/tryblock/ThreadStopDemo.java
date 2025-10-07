package com.revision.tryblock;

public class ThreadStopDemo {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			try {
				System.out.println("Try block");
				Thread.sleep(5000); // Simulate long-running task
			} catch (Exception e) {
				System.out.println("Exception");
			} finally {
				System.out.println("Finally block");
			}
		});
		t.start();
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		t.stop();

	}
}
