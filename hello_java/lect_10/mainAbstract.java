package lect_10;
abstract class spice{
    abstract void extinct();
}
class Dino extends spice{
    void extinct(){
        int a=12;
        int b=a+1;
        System.out.println(a+b);
        System.out.println("Dinosaurs extinct at the end of Cretaceous Period");
    }
}
public class mainAbstract {
    static void main() {
        Dino d = new Dino();
        d.extinct();
    }
}
