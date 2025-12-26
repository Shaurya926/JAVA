package lect_10;
// The program explain Uprcasting and Downcasting.
class animal1{
    void eat(){
        System.out.println("burger");
    }
}
class dog1 extends animal1{
    void eat(){
        System.out.println("biryanii");
    }
    void d(){
        System.out.println("die");
    }
}

public class down {
    static void main() {
        animal1 a=new dog1();
        a.eat();
        dog1 s2=(dog1)a;
        s2.d();


    }
}// Down Casting
