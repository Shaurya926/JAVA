package lect_17;
import java.util.*;

class CheckIfExists {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        System.out.println(set.contains("C"));
    }
}
//Check if its exists.