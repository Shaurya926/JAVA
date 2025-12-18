package leetCode_Question;

import java.util.Arrays;

//Dutch National flag algorithm.
public class Q1 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 2};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == low) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > low) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

