//This code explain overloading concept.
//- Definition: Having multiple methods in the same class with the same name but
// different parameter lists (number or type of arguments).

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
