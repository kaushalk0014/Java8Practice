package com.stream.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChackedExceptionTest {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1000,2000);
		
		list.forEach(handelCheckedException(num->{
			Thread.sleep(num);
			System.out.println(num);
			
		}));
		
	}
	
	static <Target> Consumer<Target> handelCheckedException(ChackedExceptionConsumer<Target, Exception> handel){
		return obj->{
			
			try {
				handel.accept(obj);
			}catch (Exception e) {
				throw new RuntimeException(e);
			}
			
		};
	}
}
