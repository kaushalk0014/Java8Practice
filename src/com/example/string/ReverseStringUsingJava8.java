package com.example.string;

public class ReverseStringUsingJava8 {

	public static void main(String[] args) {
		 String str = "kaushal";
		 
		 String reverseString=str.chars()
				 .mapToObj(c-> (char)c)
		 //.peek(System.out::println)
		 .reduce("", (s,c)->c+s, (s1, s2)-> s1+s2);
		 
		 System.out.println("Reverse String : "+ reverseString);
	}
}
