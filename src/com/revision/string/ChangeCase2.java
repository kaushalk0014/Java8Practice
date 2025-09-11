package com.revision.string;

public class ChangeCase2 {

	public static void main(String[] args) {
		String str = "A SprinG JavA";

		char charArr[] = str.toCharArray();

		for (int i = 0; i < charArr.length; i++) {

			if (Character.isUpperCase(charArr[i])) {
				charArr[i] = Character.toLowerCase(charArr[i]);
			} else if (Character.isLowerCase(charArr[i])) {
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}
		
		for(char ch: charArr) {
			System.out.println(ch);
		}
	}
}
