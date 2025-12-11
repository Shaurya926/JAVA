package lect_20;
import java.io.*;
public class J1 {
    public static void main(String[] args) {
        createData();
        try{
            File file = new File("hello.html");
            if(file.createNewFile()){
                System.out.println("File created"+file.getName());
            }else{
                System.out.println("File already exists");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static void createData(){
        try{
            FileWriter writer= new FileWriter("hello.html", true);
            writer.write(" hi");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
