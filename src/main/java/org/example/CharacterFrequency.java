package org.example;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Input string
        String s = "aabbbcddbb";

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Initialize variables
        int count = 1; // To count character occurrences

        // Iterate through the string
        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is the same as the previous one
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Append the character and its count to the result
                result.append(s.charAt(i - 1)).append(count);
                // Reset count
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(s.charAt(s.length() - 1)).append(count);

        // Print the result
        System.out.println("Output: " + result.toString());
    }
}
