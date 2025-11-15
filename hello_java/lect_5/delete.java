package lect_5;

public class delete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println("Initial"+sb);
        sb.delete(2, 6);
        System.out.println("delete(): " + sb);
    }
}
