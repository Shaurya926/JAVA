package lect_6;

public class delete_charAt {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello world");
        System.out.println("Initial"+sb);
        sb.deleteCharAt(1);
        System.out.println("deleteCharAt():"+sb);
    }
}
