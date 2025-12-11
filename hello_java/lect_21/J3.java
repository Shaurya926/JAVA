package lect_21;

import java.util.*;

// File downloading.
//MultiThreading.
class MyThread2 extends Thread {
    public void run() {
        System.out.println("Hello World");
        for (int i = 0; i <= 10; i++) {
            System.out.println("File Downloading" + i + "0%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class J3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread2 myThread = new MyThread2();
        myThread.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Complete" + i + "0%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}