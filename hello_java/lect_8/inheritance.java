package lect_8;

class animal{
    void eat(){
        System.out.println("biscuit");
    }
}
    class dog extends animal{
        void bark(){
            System.out.println("woof");
        }
    }
    class main{
        public static void main(String[] args){
            dog a=new dog();
            a.eat();
            a.bark();
        }
    }

