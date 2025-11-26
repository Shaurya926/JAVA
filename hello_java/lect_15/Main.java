package lect_15;
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,4);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(11,0));
        for(int x:map.keySet()){
            System.out.println(x);
        }
    }
}
