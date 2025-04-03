package com.example.string;

public class PalindromeString {
	
	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
		System.out.println("Is Palindrome : "+isPalindrome(str));
	}
	public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters
            System.out.println(left+"  -> Left : "+ s.charAt(left)+"   "+right+"    : Right ->: "+s.charAt(right));
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
