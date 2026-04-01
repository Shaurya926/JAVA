package DSA;

public class Array {
    static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 77;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        int []max = new int[10];
        int []min = new int[10];
        for(int i=0;i<10;i++){
            max[i]=arr[i];{
                min[i]=arr[i];
            }
            if(max[i]>arr[i]){
                max[i]=arr[i];
            }
        }
        System.out.println(max[9]);
        System.out.println(min[8]);
    }
}
