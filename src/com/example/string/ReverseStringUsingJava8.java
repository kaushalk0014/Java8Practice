package com.example.string;

public class ReverseStringUsingJava8 {

	public static void main(String[] args) {
		String str = "kaushal";

		String reverseString = str.chars().mapToObj(c -> (char) c)
				// .peek(System.out::println)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s1 + s2);

		System.out.println("Reverse String : " + reverseString);

		System.out.println("-----------------------------------");

		System.out.println(reverseValue("Spring"));

		System.out.println("------reverseValueJava8----------------------------");

		System.out.println(reverseValueJava8("Spring"));
	}

	private static String reverseValue(String str) {
		StringBuffer buffer = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
			buffer.append(str.charAt(i));
		}
		return buffer.toString();
	}

	private static String reverseValueJava8(String str) {
		return str.chars().mapToObj(ch -> (char)ch).reduce("", (s, c) -> c + s, (s1, s2) -> s1 + s2);
	}
}
