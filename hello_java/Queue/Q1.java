package Queue;

import java.util.*;
import java.util.LinkedList;
//import java.util.Queue;

public class Q1 {
    static void printBinary(int n) {
        Queue<String> q1 = new LinkedList<>();
        q1.offer("1");
        for (int i = 1; i < n; i++) {
            String curr = q1.poll();
            System.out.println(curr);
            q1.offer(curr + "0");
            q1.offer(curr + "1");
        }
    }

    static void print56(int n) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        q1.offer("5");
        q2.offer("6");
        for (int i = 1; i < n; i++) {
            String curr1 = q1.poll();
            String curr2 = q2.poll();
            System.out.println(curr1);
            System.out.println(curr2);
            q1.offer(curr1 + "5");
            q1.offer(curr1 + "6");
            q2.offer(curr2 + "5");
            q2.offer(curr2 + "6");

        }
    }

    static void main(String[] args) {
        int n = 5;
//        printBinary(n);
        print56(n);
    }
}