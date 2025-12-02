package Linked_List;
import java.util.LinkedList;
public class LAV_By_Loop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            list.add(i * 5);       // 5, 10, 15, 20, 25
        }
        System.out.println("LinkedList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
