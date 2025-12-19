package lect_17;
import java.util.*;

// Hashset
//- A collection class in java.util that implements the Set interface.
//- Stores unique elements only (no duplicates allowed).
//- Backed internally by a HashMap.
//- Provides constant-time performance (on average) for add, remove, contains, and size operations.

public class Convert_two_array {
    public static void main(String[] args) {
        HashSet<String> set = new  HashSet<>();
        set.add("Hello_Java");
        set.add("Hello_World");
        Object array[] = set.toArray();
        System.out.println(Arrays.toString(array));
    }
}
