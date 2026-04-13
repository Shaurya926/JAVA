package lect_24;

public class C2 {

        // Recursive function to check vowel
        public static boolean isVowel(char ch, String vowels, int index) {
            // Base case: if reached end of vowel string
            if (index == vowels.length()) {
                return false;
            }

            // If match found
            if (ch == vowels.charAt(index)) {
                return true;
            }

            // Recursive call
            return isVowel(ch, vowels, index + 1);
        }

        public static void main(String[] args) {
            char ch = 'e'; // change input here

            // Vowel string (both lowercase & uppercase)
            String vowels = "aeiouAEIOU";

            boolean result = isVowel(ch, vowels, 0);

            if (result) {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is not a vowel");
            }
        }
    }
