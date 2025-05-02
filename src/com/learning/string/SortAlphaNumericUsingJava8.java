package com.learning.string;

import java.util.stream.Collectors;

public class SortAlphaNumericUsingJava8 {

	public static void main(String[] args) {
		 String str = "a5p7p8l4e6";
		 
		 String digit=str.chars()
		 .filter(Character::isDigit)
		 .sorted()
		  .mapToObj(m-> String.valueOf( (char) m))
		  .collect(Collectors.joining());
		 
		 String isLetters=str.chars().
				 filter(Character::isLetter)
				 .sorted()
				 .mapToObj(ch -> String.valueOf(ch))
				 .collect(Collectors.joining());
	
		 System.out.println(isLetters);
				
				 
			
	}
}
