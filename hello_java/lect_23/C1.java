package lect_23;

public class C1 {
    static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hi");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.substring(0,3));
        System.out.println(str1.replace('1','z'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("Hello"));
        System.out.println(str1.charAt(2));

    }
}
