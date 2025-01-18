package com.intreface;

public class CalculatImplTest {

	public static void main(String[] args) {
		CalculatImpl cal=new CalculatImpl();
		Double sum=cal.sum(101d, 109d);
		System.out.println("Sum value : "+sum);
		
		// Using Lambda expression
		
		Calculat<Double> c=(num1, num2) -> num1+ num2; 
		Double SumLambda=c.sum(50D, 150D);
		System.out.println("Sum value using lambda : "+SumLambda);
	}
}
