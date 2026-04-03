package lect_23;

public class C7 {
    static void replace(int[] arr, int i)
    {
        if(i==arr.length) return;
        if(arr[i]==2) arr[i]=5;
        replace(arr,i+1);
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0;
        replace(arr,i);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
