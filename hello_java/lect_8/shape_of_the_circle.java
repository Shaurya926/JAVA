class shape{
    void perform(){
        System.out.println("circle");
    }
}
class shape_1 extends shape{
    void cla(){
        System.out.println("area of a circle= r*r");
    }
}

public void main(String[] args) {
    shape s=new shape();
    s.perform();
    shape_1 d=new shape_1();
    d.cla();
}
