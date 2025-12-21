package lect_12;
// This program purpose
// To find out the area of a different shape
// Applying abstract class method and
// Using overriding method.

abstract class shape
// - Abstract methods (methods without a body, only a declaration)

{
    abstract void area();
}
class circle extends shape{
    int r;
    public circle(int r){
        this.r=r;
    }
    void area(){
        double result=r*r;
        System.out.println("Area of circle is:" +result);
    }
}
class rectangle extends shape{
    int lenght;
    int b;
    public rectangle(int lenght,int b){
        this.lenght=lenght;
        this.b=b;
    }
    void area(){
        double result=lenght*b;
        System.out.println("Area of rectangle is:"+result);
    }
}
public class main {
    public static void main(String[] args) {
        circle c=new circle(5);
        c.area();
        rectangle r1=new rectangle(14,20);
        r1.area();
    }
}
