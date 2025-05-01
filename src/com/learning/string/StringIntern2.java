package com.learning.string;

public class StringIntern2 {

	public static void main(String[] args) {
		String str1 = "spring";                  //Line1
		String str2 = new String("spring");      //Line2
		str2.intern();                           //Line 3
		System.out.println(str1 == str2);//false
		
		/*
		 * Here output is false because of string is a immutable 
		 * when we are doing any operation on string the string create new object in constant pool
		 * same we are doing line number 8 "str2.intern()"
		 * 
		 * below we can see true value coming because I am storing string reference value in str3
		 */
		
		String str3=str2.intern();
		
		System.out.println(str1== str3); //true
	}
}
