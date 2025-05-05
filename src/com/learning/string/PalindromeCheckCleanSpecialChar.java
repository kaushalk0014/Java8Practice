package com.learning.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeCheckCleanSpecialChar {

    public static void main(String[] args) {
        List<String> input = List.of("Madam", "Step on no pets!", "Hello!", "No 'x' in Nixon");

        System.out.println(cleanAndFindPalindromes(input)); // [madam, steponnopets, noxinnixon]
    }

    public static List<String> cleanAndFindPalindromes(List<String> inputList) {
        List<String> allPalindrome = new ArrayList<>();

        for (String str : inputList) {
            // Remove all non-alphanumeric characters and convert to lowercase
            String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (isPalindrome(cleaned)) {
                allPalindrome.add(cleaned);
            }
        }

        return allPalindrome;
    }

    private static boolean isPalindrome(String str) {
        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
    }
}
