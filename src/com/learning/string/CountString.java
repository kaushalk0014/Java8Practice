package com.learning.string;

public class CountString {

	public static void main(String[] args) {
		 String str = "AAAaccbeGGGHH";
		 //output: A4C2BEG3H2
		 StringBuilder result=new StringBuilder();
		 
		 str=str.toUpperCase();
		 int i=0;
		 while(i<str.length()) {
			 
			 int count=1;
			 char ch=str.charAt(i);
			 
			 while(i+1<str.length() && ch==str.charAt(i+1)) {
				 count++;
				 i++;
			 }
			 
			 if(count>1) {
				 result.append(ch).append(count);
			 }else {
				 result.append(ch);
			 }
			 i++;
		 }
		 
		 System.out.println("Result : "+ result);
	}
}
