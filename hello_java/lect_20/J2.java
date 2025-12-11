package lect_20;

import java.io.*;

public class J2 {public static void main(String[] args) {
    //createData();
    readFileData();
    try{
        File file = new File("hello.html");
        if(file.createNewFile()){
            System.out.println("File created"+file.getName());
        }else{
            System.out.println("\nFile already exists");
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
    static void readFileData(){
    try{
          FileReader reader= new FileReader("hello.html");
          int ch;
          while((ch=reader.read())!=-1){
              System.out.print((char)ch);
          }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

