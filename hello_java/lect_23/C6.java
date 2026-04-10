package lect_23;

public class C6 {
    static int find_occure(int [] arr, int key, int i)
    {
        if(i==arr.length) return 0;
        int count = (arr[i] == key) ? 1 : 0;
        return count + find_occure(arr, key, i+1);
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key=5;
        int i =0;
        System.out.println(find_occure(arr,key,i));
    }
}
