package lect_15;
import java.util.*;
public class J3 {
    public static void main(String[] args) {
        String str1 = "helloooonfeibshd";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for(char ch : str1.toCharArray()){
            if(map.get(ch) == 4){
                System.out.println(ch);
                break;
            }
        }
    }
}