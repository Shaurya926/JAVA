package overloading;


class OverloadDemo {

    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}

