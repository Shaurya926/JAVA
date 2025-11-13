package lect_8;
class animal_1{
    void eat(){
        System.out.println("biscuit");
    }
}
class dog_1 extends animal{
    void bark(){
        System.out.println("woof");
    }
}
class puppy_1 extends dog{
    void sleep(){
        System.out.println("woooof");
    }
    }
    class old_dog extends dog_1{
    void shu(){
        System.out.println("howl");
    }
}
class main_1{
    public static void main(String[] args){
        old_dog obj = new old_dog();
        obj.shu();
        puppy a=new puppy();
        a.eat();
        a.bark();
        a.sleep();

    }
}


