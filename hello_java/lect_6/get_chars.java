package lect_6;

public class get_chars {
    static void main() {
        StringBuilder sb = new StringBuilder("hello_bye");
        System.out.println(sb.toString());
        char[] arr = new char[5];
        sb.getChars(2, 5, arr, 0);
        System.out.print("getChars(): ");
        for (char c : arr) {
            System.out.print(c);
        }
    }
}