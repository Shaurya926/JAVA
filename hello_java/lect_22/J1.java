package lect_22;
//Different way to use multi thread.
class myThread implements Runnable{
    public void run(){
        System.out.println("My thread is running");
        System.out.println("My thread is completed");
    }
}
public class J1 {
    public static void main(String[] args) {
        myThread task = new myThread();
        Thread t1= new Thread(task);
        Thread t2= new Thread(task);
        t1.start();
        t2.start();
    }
}
