package lect_18;
import java.util.ArrayList;
import java.util.Iterator;

public class C1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(5);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value);
            if(value==6){
            it.remove();
            }
        }
        System.out.println(list);
    }
}
