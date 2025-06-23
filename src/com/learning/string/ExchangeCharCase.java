package com.learning.string;

public class ExchangeCharCase {

	public static void main(String[] args) {
		
		String str="KauShaL";
		
		char[] chArr= str.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				chArr[i]=(char) (ch+32);
			}
			if(ch>='a' && ch<='z') {
				chArr[i] = (char) (ch-32);
			}
		}
		
		String result= new String(chArr);
		
		System.out.println("Result : "+ result);
		 
	}
}
