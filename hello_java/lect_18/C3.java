package lect_18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(2);
        ListIterator<Integer> ot = list.listIterator();

        while (ot.hasNext()) {
            Integer x = ot.next();
            if (x == 7) {
                ot.set(5);
                ot.add(8);
            }

        }
        while (ot.hasPrevious()) {
            System.out.println(ot.previous());
        }

        while (ot.hasNext()) {
            System.out.println(ot.next());
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer val = it.next();
            if (val == 6) {
                it.remove();
            } else {
                System.out.println(val);
            }
        }

        System.out.println(list);

    }
}