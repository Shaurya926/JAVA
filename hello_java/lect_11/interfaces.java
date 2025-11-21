package lect_11;

interface a{
    void login();
    default void failed(){
        System.out.println("Login failed");
    }
}
interface b {
    void singin();
}
class c implements a,b{
    public void login(){
        System.out.println("Login Successful");
    }
    public void singin(){
        System.out.println("Singing in Successful");
    }
}
public class interfaces {
    public void main(){
        c c1=new c();
        c1.failed();
        c1.login();
        c1.singin();
    }
}
