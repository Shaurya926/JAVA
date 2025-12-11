package lect_21;
import java.util.*;

class MyThread1 extends Thread{
        public void run(){
            System.out.println("hello");
            // System.out.println(Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                System.out.println(i+" t1");
                try{
                    Thread.sleep(1000);
                    // 1 Second pause.
                }catch(InterruptedException e){

                }
            }
        }
    }
    public class J2 {
        public static void main(String[] args) {
            System.out.println(Thread.currentThread().getName());
            MyThread1 t1= new MyThread1();
            t1.start();
            // Use try catch.
            try{
                t1.join();
            }catch(InterruptedException e){
                for(int i=0;i<10;i++){
                System.out.println(i+" main");
            }
            }
        }
    }
