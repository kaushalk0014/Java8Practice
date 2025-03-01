package com.example.swapnumber;

public class SwapNumber {
	public static void main(String[] args) {
	
		swapTwoNumberUsingTemp();
		swapTwoNumber();
	}
	
	private static void swapTwoNumberUsingTemp() {
		System.out.println("Swap two number using temp");
		int a = 40;
		int b = 50;
		
		System.out.println("Before swap A : "+ a+ "  B : "+ b);
		
		int temp=a;
		a=b; 
		b= temp;	
		
		System.out.println("After swap  A : "+ a+ "  B : "+ b);
	
	}
	
	private static void swapTwoNumber() {

		System.out.println("\nSwap two number");
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swap A : "+ a+ "  B : "+ b);
		
		a = a + b; // 30 = 10+20;
		b = a - b; // 10 = 30-20;
		a = a - b; // 20 = 30-10;
		
		System.out.println("After swap  A : "+ a+ "  B : "+ b);
	
	}
}
