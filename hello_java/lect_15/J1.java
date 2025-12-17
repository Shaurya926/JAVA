package lect_15;
import java.util.*;
//Using HashMap to create an array and print element according index value.
public class J1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[]={2,3,4,2,4,2};
        for(int x : a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}
