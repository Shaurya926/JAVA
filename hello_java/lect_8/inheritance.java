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
        class puppy extends dog{
    void sleep(){
        System.out.println("woooof");
    }
    }
    class main{
        public static void main(String[] args){
            puppy a=new puppy();
            a.eat();
            a.bark();
            a.sleep();

        }
    }

