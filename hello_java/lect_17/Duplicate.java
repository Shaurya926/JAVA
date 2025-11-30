package lect_17;
import java.util.*;

public class Duplicate {
public static void main(String[] args) {
    int array[]={1,4,6,2,7};
    HashSet<Integer> set=new HashSet<>();
    HashSet<Integer> dup=new HashSet<>();
    HashSet<Integer> rep=new HashSet<>();
    for (int nums: array){
        if(!set.add(nums)){
            dup.add(nums);
        }
    }
    System.out.println(dup);
    System.out.println(rep);

}
}
