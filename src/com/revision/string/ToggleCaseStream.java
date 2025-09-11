package com.revision.string;

public class ToggleCaseStream {

	public static void main(String[] args) {
		 String str = "A SprinG JavA";
		 
		 String result = str.chars().mapToObj(c->{
			 if(Character.isUpperCase(c)) {
				 return Character.toLowerCase((char)c);
			 }else if(Character.isLowerCase(c)) {
				 return Character.toUpperCase((char)c);
			 }else {
				 return (char)c;
			 }
		 }).collect(StringBuilder::new,
				 	StringBuilder::append,
				 	StringBuilder::append).toString();
	
		 System.out.println(result);
	}
}
