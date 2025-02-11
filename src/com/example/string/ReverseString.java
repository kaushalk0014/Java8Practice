package com.example.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "kaushal";

		System.out.println("---------Approach 1---------");
		char[] ch = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			builder.append(ch[i]);
		}
		System.out.println("Reverse data : " + builder);

		System.out.println("---------Approach 2---------");
		StringBuilder builder2 = new StringBuilder(str);
		builder2.reverse();

		System.out.println("Reverse data : " + builder2);

		System.out.println("---------Approach 3---------");
		
		
		StringBuffer buffer=new  StringBuffer(str);
		buffer.reverse();
		System.out.println("Reverse data : " + buffer);

		System.out.println("---------Approach 4---------");
		
		
		
		char[] strArr=str.toCharArray();
		
		int min=0;
		int max=str.length()-1;
		
		while(min<max) {
			char minChar=str.charAt(min);
			
			strArr[min]=strArr[max];
			strArr[max]=minChar;
			min++;
			max--;
		}
		System.out.println(strArr);
		 
		
		
		
		
		
		
		

		
		
		

	}
}
