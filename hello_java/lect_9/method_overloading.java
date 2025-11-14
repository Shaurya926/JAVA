class mo{
    void add(int a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

void main() {
    mo m = new mo();
    m.add(1);
    m.add(1,2);
    m.add(2,5,6);
}
