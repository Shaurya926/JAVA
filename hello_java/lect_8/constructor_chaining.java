package lect_8;

class hello {
    public hello() {
        this(5);
        System.out.println("hi");
    }


    public hello(int a) {
        this(5, 6);
        System.out.println(a);
    }

    public hello(int a, int b) {
        System.out.println(a);
    }

    static void main() {
        hello obj = new hello();
        hello obj2 = new hello(5, 6);
    }
}

