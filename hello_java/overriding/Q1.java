package overriding;
abstract class Shape{
   abstract void Draw();
}
class Circle extends Shape{
    void Draw(){
        System.out.println("Circle");
    }
}
class Square extends Shape{
    void Draw(){
        System.out.println("Square");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.Draw();
        Square s=new Square();
        s.Draw();
    }
}
