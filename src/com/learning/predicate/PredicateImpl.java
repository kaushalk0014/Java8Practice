package com.learning.predicate;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t>20?true:false;
	}
	public static void main(String[] args) {
		Predicate<Integer> pre=new PredicateImpl();
		boolean result =pre.test(15);
		System.out.println("Result : "+ result);
	}
}
