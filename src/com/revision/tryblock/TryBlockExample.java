package com.revision.tryblock;

public class TryBlockExample {

	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
	}
}
