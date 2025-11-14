class shape {
    void area(double b) {
        System.out.println("Area of circle="+(3.14*b*b));
    }
    void area(int s){
        System.out.println("Area of Square="+(s*s));
    }
    void area(int l, int b){
        System.out.println("Area of Rectangle="+(l*b));
    }
}
 void main() {
    shape s1 = new shape();
    s1.area(5.0);
    s1.area(6);
    s1.area(3,4);
}
