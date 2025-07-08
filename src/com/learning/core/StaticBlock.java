package com.learning.core;

class A {

	A() {
		System.out.println("A Constructor");
	}

	public void inst() {
		System.out.println("Inst A");
	}

	{
		System.out.println("Inst block A");
	}
	static {
		System.out.println("Static A");
	}
}

class B extends A {

	public void inst() {
		System.out.println("Inst B");
	}

	{
		System.out.println("Inst block B");
	}
	static {
		System.out.println("Static B");
	}
}

public class StaticBlock {

	public  void inst(){ 
		System.out.println("Inst C");
	}
	public static void main(String[] args) {
		B b= new B();
		System.out.println("Running");
	}
}
