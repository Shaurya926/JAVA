package lect_16;
import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
    String name;
    int age;
    int Roll_number;
    public Student(String name, int age, int Roll_number) {
        this.name = name;
        this.age = age;
        this.Roll_number = Roll_number;
    }
    public int compareTo(Student s1) {
        return this.Roll_number - s1.Roll_number;
    }
    public String toString() {
        return this.name + " " + this.age + " " + this.Roll_number;
    }
}
class M1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Om",22,56));
        list.add(new Student("Shaurya",22,55));
        list.add(new Student("Ram",22,60));
        list.add(new Student("Vansh",22,57));
        list.add(new Student("Shanya",22,53));
        list.add(new Student("Arya",22,58));
        list.add(new Student("Siddharth",22,52));
        list.add(new Student("Vishwajeet",22,54));
        list.add(new Student("Soniya",22,50));
        list.add(new Student("Aditya",22,59));
        list.add(new Student("Aryan",22,51));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}

