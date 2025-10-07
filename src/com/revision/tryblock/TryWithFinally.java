package com.revision.tryblock;

public class TryWithFinally {

	public static void main(String[] args) {
		calculateResult(2, 5);
	}

	private static void calculateResult(int a, int b) {
		int result = a + b;
		printResult(result);
	}

	/*
	 * 1. "Start" is printed - The first line inside try executes normally. 
	 * 2. Exception is thrown - int x = 5 / 0; causes an ArithmeticException. - The JVM
	 * immediately jumps out of the try block. - "End" is skipped because control
	 * never reaches it. 
	 * 3. finally block executes - Even though no catch is
	 * present, the finally block still runs. - "Finally block" is printed. 
	 * 4. Exception propagates - After finally, the exception is re-thrown to the
	 * caller (e.g., the JVM). - If not caught elsewhere, the program terminates
	 * with an error.
	 * 
	 */
	private static void printResult(int result) {
		try {
			if (result < 10) {
				throw new RuntimeException("Sum less then 10");
			}
			System.out.println("Result : " + result);
		} finally {
			System.out.println("Finally Block");
		}
	}
}
