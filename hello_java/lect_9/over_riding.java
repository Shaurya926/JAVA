//This program explain over-riding.
//- Definition: When a subclass provides a specific implementation of
// a method that is already defined in its superclass.

package lect_9;
class animal{
    void eat(){
        System.out.println("burger");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("dog_food");
    }
}
public class over_riding {
    public static void main(String[] args) {
        animal a = new dog();
        a.eat();
    }
}
