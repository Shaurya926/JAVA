package lect_5;

public class count_character {
    public static void main(String[] args) {
        String str = "aabbccaabbaac";
        StringBuilder result = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i + 1 < n && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            result.append(str.charAt(i));

            if (count > 1) {
                result.append(count);


            }
        }System.out.println(result);
    }
}
