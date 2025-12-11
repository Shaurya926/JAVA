package lect_21;
import java.util.*;

class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
       // System.out.println(Thread.currentThread().getName());
       for(int i=0;i<10;i++){
           System.out.println(i+" t1");
       }
    }
}
public class J1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1= new MyThread();
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println(i+" main");
        }
    }
}
