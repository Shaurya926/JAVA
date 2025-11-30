package lect_17;
import java.util.*;
public class Convert_two_array {
    public static void main(String[] args) {
        HashSet<String> set = new  HashSet<>();
        set.add("Hello_Java");
        set.add("Hello_World");
        Object array[] = set.toArray();
        System.out.println(Arrays.toString(array));
    }
}
