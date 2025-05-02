package com.learning.string;

import java.util.stream.Collectors;

public class SortAlphaNumericUsingJava8 {

	public static void main(String[] args) {
		 String str = "a5p7p8l4e6";
		 
		 String digits=str.chars()
		 .filter(Character::isDigit)
		 .sorted()
		  .mapToObj(m-> String.valueOf( (char) m))
		  .collect(Collectors.joining());
		 
		 String letters=str.chars().
				 filter(Character::isLetter)
				 .sorted()
				 .mapToObj(ch -> String.valueOf( (char)ch))
				 .collect(Collectors.joining());
	
		 String result = digits + letters;
		 System.out.println(result);
				
				 
			
	}
}
