package lect_16;

import java.util.ArrayList;
import java.util.Collections;
// Basic to create a list and how to use "collections.sort();"

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }
}
