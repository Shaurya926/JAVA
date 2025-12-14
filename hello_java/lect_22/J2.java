package lect_22;
import java.util.*;

public class J2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(20);
        list.add(30);
        list.add(98);
        list.add(75);
        list.add(31);
        list.add(22);
        List<Integer> result = list.stream().filter(n->n>70).toList(); //filter is use to select elements.
        List<Integer> mapresult = list.stream().map(n->n*2).toList();
        int data = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);
//        System.out.println(result);
//        System.out.println(mapresult);
        // different method map.reduce function.
    }
}
// list.stream method uses to convert list into a stream of elements,so we
// can perform operations on them.

