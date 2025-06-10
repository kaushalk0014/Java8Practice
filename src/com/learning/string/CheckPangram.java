package com.learning.string;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CheckPangram {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
        if (isPanagram(input)) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is NOT a Pangram.");
        }
        //Predicate<T>
        //Function<T, R>
        //Consumer<T>
        //Supplier<T>
	}
	
	public static boolean isPanagram(String str) {
		str=str.toLowerCase();
		 
		long size=Stream.of(str.split(""))
		.filter(ch->ch.matches("[a-z]"))
		.distinct()
		.count();
		 
		return size==26;
	}
}
