package lect_5;

public class deleteCharAt {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt():"+sb);
    }
}
