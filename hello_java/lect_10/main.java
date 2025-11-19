package lect_10;
class animal{
    void eat(){
        System.out.println("burger");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("biryanii");
    }
    void d(){
        System.out.println("die");
    }
}

public class main {
    public static void main(String[] args) {
        animal a = new dog();
        a.eat();
    }
}
