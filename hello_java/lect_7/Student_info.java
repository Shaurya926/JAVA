package lect_7;
class Student {
    String name;
    int age;
    int Roll_no;
    double marks;
    Student(String name, int age, int Roll_no, double marks) {
        this.name = name;
        this.age = age;
        this.Roll_no = Roll_no;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no: " + Roll_no);
        System.out.println("Marks: " + marks);
    }

    static void main() {
        Student s1 = new Student("Shaurya", 20, 90, 1200);
        s1.display();
        Student s2 = new Student("Sadie", 20,100,132);
        s2.display();
    }
}
