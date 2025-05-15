package com.learning.string;

public class MaskEmail {

	public static void main(String[] args) {
		String str = "kaushal.kumar@gmail.com";
		// output: k******.k****@gmail.com
		String parts[] = str.split("@");
		String username = parts[0];
		String domain = parts[1];

		String nameParts[] = username.split("\\.");
		StringBuilder masked = new StringBuilder();
		
		for(int i=0; i<nameParts.length; i++) {
			String name=nameParts[i];
			if(name.length()>1) {
				masked.append(name.charAt(0));
				masked.append("*".repeat(name.length()-1));
			}else {
				masked.append(name);
			}
			if(i<nameParts.length-1) {
				masked.append(".");
			}
		}
		masked.append("@").append(domain);
		
		System.out.println("Result : "+ masked);
	}
}
