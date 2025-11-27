package lect_16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    String Name;
    int Roll_no;
    int age;
    public Student1(int Roll_no, String Name, int age) {
        this.Name=Name;
        this.Roll_no=Roll_no;
        this.age=age;
    }
}
class NameSorted implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.Name.compareTo(s2.Name);
    }
}
class M2 {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(22,"Shiva",18));
        list.add(new Student1(23,"Somya",19));
        list.add(new Student1(24,"Tony",20));
        Collections.sort(list,new NameSorted());
        for(Student1 s:list){
            System.out.println(s.Roll_no+" "+s.Name+" "+s.age);
        }
    }

}
