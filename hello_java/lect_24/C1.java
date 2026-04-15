package lect_24;

public class C1 {
        // Recursive function
        public static boolean allSame(String str, int index) {
            // Base case: if we reach end of string
            if (index == str.length() - 1) {
                return true;
            }

            // If current char is not equal to next char → false
            if (str.charAt(index) != str.charAt(index + 1)) {
                return false;
            }

            // Recursive call for next index
            return allSame(str, index + 1);
        }

        public static void main(String[] args) {
            String str = "bbb"; // change input here

            if (str.length() == 0) {
                System.out.println("Empty string");
            } else {
                boolean result = allSame(str, 0);
                System.out.println("All characters same? " + result);
            }
        }
    }

