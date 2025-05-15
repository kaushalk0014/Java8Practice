package com.learning.design.singleton;

public class SingleTon {

	private SingleTon() {
		if (SingleTonHelper.INSTANCE != null) {
            throw new RuntimeException("Use getInstance() method");
        }
	}
	
	private static class SingleTonHelper{
		
		private static final SingleTon INSTANCE=new SingleTon();
	}
	
	public static SingleTon getInstance() {
		return SingleTonHelper.INSTANCE;
	}
}
