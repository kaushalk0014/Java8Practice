package com.learning.string;

public class CompressString {

	public static void main(String[] args) {
		String str = "aaabcdddeeff";
		//output : #3abc#3d#2e#2f
		
		StringBuilder result=new StringBuilder();
		
		int i=0;
		while(i<str.length()) {
			
			int count=1;
			char ch=str.charAt(i);
			
			while(i+1<str.length() && str.charAt(i+1)==ch) {
				count++;
				i++;
			}
			if(count>1) {
				result.append("#").append(count).append(ch);
			}else {
				result.append(ch);
			}
			i++;
		}
		
		System.out.println("Result : "+result);
	}
}
