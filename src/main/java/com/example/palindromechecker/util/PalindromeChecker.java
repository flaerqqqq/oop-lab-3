package com.example.palindromechecker.util;

/**
 * The PalindromeChecker class provides methods for checking whether a given input string is a palindrome.
 */
public class PalindromeChecker {

    /**
     * Checks whether given input string is a palindrome using pointers method.
     * Compares character by moving pointers toward a center
     * O(n) time complexity, like v2 method, but more effective for longer words (1000+ symb)
     *
     * @param string the input string to be validated
     * @return true if the string is a palindrome, false otherwise
     * @throws RuntimeException if the input string is null, empty, or does not contain at least one letter
     */
    public static boolean checkV1(String string) {
        if (string.length() == 1) {
            return true;
        }

        validate(string);

        String letterString = filterLetters(string);

        for (int i = 0, j = letterString.length() -1; i < letterString.length() / 2 && j > letterString.length() / 2 - 1; i++, j--) {
            if (letterString.charAt(i) != letterString.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks whether given input string is a palindrome using string reversal.
     * Compares original string with reversed one
     * O(n) time complexity, effective for words with less letters.
     *
     * @param string the input string to be validated
     * @return true if the string is a palindrome, false otherwise
     * @throws RuntimeException if the input string is null, empty, or does not contain at least one letter
     */
    public static boolean checkV2(String string) {
        if (string.length() == 1) {
            return true;
        }

        validate(string);

        String letterString = filterLetters(string);

        String reversedString = new StringBuilder(letterString).reverse().toString();
        return letterString.equals(reversedString);
    }

    /**
     * Filters the input string to retain only letters.
     *
     * @param string the input string to be filtered
     * @return a new string containing only letters
     */
    private static String filterLetters(String string) {
        return string.replace("[^a-zA-Z]", "").toLowerCase();
    }

    /**
     * Validates the input string to ensure it is not null, not empty, and contains at least one letter.
     *
     * @param string the input string to be validated
     * @throws RuntimeException if the input string is null, empty, or does not contain at least one letter
     */
    private static void validate(String string) {
        if (string == null) {
            throw new RuntimeException("Input string cannot be null");
        } else if (string.isEmpty()) {
            throw new RuntimeException("Empty input string.");
        } else if (!string.matches(".*[a-zA-Z]+.*")) {
            throw new RuntimeException("Input string should contain at least one letter.");
        }
    }
}
