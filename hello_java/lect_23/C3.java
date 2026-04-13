package lect_23;

public class C3 {
    static int count(int x){
        if(x==0) return 0;
        return 1+count(x-1);
    }

    static void main(String[] args) {
        int x = 12345;
        System.out.println(count(x));
    }
}
