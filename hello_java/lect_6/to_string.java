package lect_6;

public class to_string {
    static void main() {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Initial:"+sb);
        String finalString = sb.toString();
        System.out.println("\ntoString(): " + finalString);
    }
}
