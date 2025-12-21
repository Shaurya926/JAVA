package leetCode_Question;
import java.util.*;
public class Q5 {

        public static int[] plusOne(int[] digits) {
            // Traverse from the last digit backwards
            for (int i = digits.length - 1; i >= 0; i--) {
                // If current digit is less than 9, just increment and return
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                // If digit is 9, set it to 0 and continue loop (carry over)
                digits[i] = 0;
            }

            // If all digits were 9, we need an extra digit at the front
            int[] result = new int[digits.length + 1];
            result[0] = 1; // e.g. 999 + 1 = 1000
            return result;
        }

        public static void main(String[] args) {
            int[] digits1 = {1, 2, 3};
            int[] digits2 = {4, 3, 2, 1};
            int[] digits3 = {9};

            System.out.println(Arrays.toString(plusOne(digits1))); // [1, 2, 4]
            System.out.println(Arrays.toString(plusOne(digits2))); // [4, 3, 2, 2]
            System.out.println(Arrays.toString(plusOne(digits3))); // [1, 0]
        }
    }

