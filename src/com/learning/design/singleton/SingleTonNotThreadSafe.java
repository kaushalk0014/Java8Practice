package com.learning.design.singleton;

public class SingleTonNotThreadSafe {

	private static SingleTonNotThreadSafe instance;
	
	private SingleTonNotThreadSafe() {
		
	}
	
	public static SingleTonNotThreadSafe getInstance() {
		
		if(instance==null) {
			instance=new SingleTonNotThreadSafe();
		}
		return instance;
	}
}
