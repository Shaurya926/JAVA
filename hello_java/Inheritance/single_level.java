package Inheritance;

class book{
    void fire_and_blood(){
        System.out.println("strongest house in westeros");
    }
}
class book_1 extends book{
    void rulers(){
        System.out.println("Targaryen");
    }
}
class book_2{
    static void main() {
        book b = new book();
        b.fire_and_blood();
        book_1 a = new book_1();
        a.rulers();

    }
}