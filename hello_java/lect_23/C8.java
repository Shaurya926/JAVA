package lect_23;

public class C8 {
    static int even_sum(int[] arr,int i){
        if(i==arr.length-1) return 0;
        int val = (arr[i]%2==0)? arr[i]:0;
        return val + even_sum(arr,i+1);
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i=0;
        System.out.println(even_sum(arr,i));
    }
}
