package Array_List;
import java.util.ArrayList;
// Using Iterate
public class Question_1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Sir");
        list.add("How can I help you?");

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
