package com.learning.string;

public class StringIntern {

	public static void main(String[] args) {
		String str="spring";
		String str2="spring";
		
		System.out.println(str==str2);//true
		
		String str3 = new String("spring");
		System.out.println(str==str3);//false
		
		String str4=new String("spring");
		System.out.println(str3==str4); //false
		
		/*
		 * What does the string intern() method do in Java?
		 * If you apply the intern()
		 * method to a few strings, you will ensure that all strings having the same
		 * content share the same memory. As soon as a String object is invoked with
		 * intern(), it first checks if the string value of the String object is already
		 * present in the string pool and if it is available, then the reference to that
		 * string from the string constant pool is returned. If not, a new string object
		 * is added to the string pool, and a reference to it is returned.
		 */
		
		String str5=new String("spring").intern();
		
		System.out.println(str==str5);//true
		
		
		
		
	}
}
