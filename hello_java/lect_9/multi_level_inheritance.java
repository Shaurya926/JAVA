class person{
    void display_name(){
        System.out.println("Name of person: Shaurya Dubey");
    }
}
class student extends person{
    void display_class(){
        System.out.println("Class of student: 12th");
    }
}
class Monitor extends student {
    void check_discipline(){
        System.out.println("Checking discipline....");
    }
}

void main() {
    person p = new person();
    student s = new student();
    Monitor m = new Monitor();
    p.display_name();
    s.display_class();
    m.check_discipline();
}