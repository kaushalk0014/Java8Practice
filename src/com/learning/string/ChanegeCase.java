package com.learning.string;

public class ChanegeCase {

	public static void main(String[] args) {
		String s="My Is KaasHal";
		int startUpper=65;
		int startLower=97;
		
		char charArr[]=s.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			int compareUppper=0;
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				
				int ch=s.charAt(i);
				 compareUppper=ch-startUpper;
				 int toLower=startLower+compareUppper;
				 char charValue=(char)toLower;
				 charArr[i]=charValue;
			}
		}
		for(int i=0; i<charArr.length; i++) {
			int compareLower=0;
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				int ch=s.charAt(i);
				 compareLower=ch-startLower;
				 int toUpper=startUpper+compareLower;
				 char charValue=(char)toUpper;
				 charArr[i]=charValue;
			}
		}
		
		for(char ch: charArr) {
			System.out.println(ch);
		}
	}
}
