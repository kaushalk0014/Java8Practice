package com.revision.singleton;

public class SingleTon {

		private SingleTon() {
			System.out.println("Instance created first time");
		}
		
		private static class SingleInstance{
			private static final SingleTon instance =  new SingleTon();
		}
		
		public static SingleTon getInstance() {
			return SingleInstance.instance;
		}
}
