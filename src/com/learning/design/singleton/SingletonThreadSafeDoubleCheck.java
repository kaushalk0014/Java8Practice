package com.learning.design.singleton;

public class SingletonThreadSafeDoubleCheck {
	
	private static SingletonThreadSafeDoubleCheck instance;
	
	private SingletonThreadSafeDoubleCheck() {}
	
	public static SingletonThreadSafeDoubleCheck getInstance() {
		
		if(instance==null) {
			synchronized(SingletonThreadSafeDoubleCheck.class) {
				if(instance==null) {
					instance=new SingletonThreadSafeDoubleCheck();
				}
			}
		}
		return instance;
	}

}
