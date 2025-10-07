package com.revision.tryblock;

public class TryBlockExample2 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
	}
}
