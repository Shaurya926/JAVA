package lect_24;

public class C3 {
    static int count(String s, int i) {
        if (i == s.length()) return 0;

        if (s.charAt(i) == 'a')
            return 1 + count(s, i + 1);

        return count(s, i + 1);
    }

    public static void main(String[] args) {
        String str = "behihuc";
        int i = 0; // start from index 0
        System.out.println(count(str, i));
    }
}