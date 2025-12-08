package lect_18;
import java.util.ArrayList;
import java.util.ListIterator;

public class C2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
        while(it.hasPrevious()){
            Integer i = it.previous();
            System.out.println(i);
        }
    }
}
