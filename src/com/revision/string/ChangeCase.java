package com.revision.string;

public class ChangeCase {

	public static void main(String[] args) {
		String str = "A SprinG JavA";
		
		int startUpperCase = 65;
		
		int startLowerCase = 97;
		
		char[] charArr = str.toCharArray();
		
		for(int i = 0; i< charArr.length; i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				int ch=charArr[i];
				charArr[i]= (char) (startLowerCase+(ch-startUpperCase));
			}
		}//toUpper Case
		 
		for(int j =0; j< charArr.length; j++) {
			if(str.charAt(j)>=97 && str.charAt(j)<=122) {
				int ch = charArr[j];
				charArr[j]=(char) (startUpperCase+(ch-startLowerCase));
			}
		}
		
		for(char ch : charArr) {
			System.out.println(ch);
		}
	}
}
