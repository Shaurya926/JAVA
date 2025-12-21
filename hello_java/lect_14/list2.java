package lect_14;
import java.util.ArrayList;

//This program is about...
// Creating an arraylist and using for loop to print the list

class list2Main {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(0, 22);
        System.out.println(List);
        List1.add(1);
        List1.add(2);
        List1.add(1, 11);
        List1.addAll(List);
        System.out.println(List1);
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        for(int num : List){
            System.out.println(num);
        }
    }
}
