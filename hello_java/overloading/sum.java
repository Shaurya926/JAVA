class sum {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
}
void main(){
    sum s=new sum();
    s.add(3,4);
    s.add(4,6,7);
    s.add(2.5,3.5);
}
